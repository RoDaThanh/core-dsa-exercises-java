package org.practice.thread;

import java.util.concurrent.*;

public class MoneyTransferringRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 10;
        int numAccounts = 50;
        double initialBalance = 100_000;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Bank bank = new Bank(numAccounts, initialBalance);

        CountDownLatch latch = new CountDownLatch(numThreads);
        for (int i = 0; i < numThreads; i++) {
            executor.submit(() -> {
                try {
                    for (int a = 0; a < 50; a++) {
                        double amount = 1000 * Math.random();
                        int from, to;
                        do {
                            from = ThreadLocalRandom.current().nextInt(bank.size());
                            to = ThreadLocalRandom.current().nextInt(bank.size());
                        } while (from == to);

                        try {
                            bank.transfer(from, to, amount);
                            Thread.sleep(ThreadLocalRandom.current().nextInt(10));
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt(); // restore interrupt status
                            break;
                        }
                    }
                } finally {
                    latch.countDown();
                }
                return null;
            });
        }
        latch.await();
        executor.shutdown(); // Graceful shutdown
        if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
            System.err.println("Tasks did not finish in time, forcing shutdown...");
            executor.shutdownNow(); // Force shutdown if stuck
        }
    }
}
