package org.practice.thread;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private double[] accounts;

    private Lock bankLock = new ReentrantLock();

    public Bank(int numberOfAccount, double initialBalance) {
        accounts = new double[numberOfAccount];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        bankLock.lock();
        try {
            if (this.accounts[from] < amount) return;
            this.accounts[from] -= amount;
            this.accounts[to] += amount;
            System.out.printf(Thread.currentThread()+ "%10.2f from %d to %d", amount, from, to);
            System.out.println();
            System.out.printf("Total balance: %10.2f", getTotalBalance());
            System.out.println();
        } finally {
            bankLock.unlock();
        }
    }

    private double getTotalBalance() {
        return Arrays.stream(this.accounts).sum();
    }

    public int size() {
        return accounts.length;
    }
}
