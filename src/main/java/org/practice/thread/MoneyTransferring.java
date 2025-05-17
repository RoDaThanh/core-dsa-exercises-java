package org.practice.thread;

public class MoneyTransferring {
    public static void main(String[] args) {
        var bank = new Bank(4, 100000);

        Runnable transferRunnable1 = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    double amount = 1000 * Math.random();
                    bank.transfer(0,1, amount);
                    Thread.sleep((int) (10 * Math.random()));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable transferRunnable2 = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    double amount = 10000 * Math.random();
                    bank.transfer(2,3, amount);
                    Thread.sleep((int) (10 * Math.random()));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(transferRunnable1);
        Thread thread2 = new Thread(transferRunnable2);
        thread1.start();
        thread2.start();
    }

}
