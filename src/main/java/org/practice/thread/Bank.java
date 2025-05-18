package org.practice.thread;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private final double[] accounts;


    public Bank(int numberOfAccount, double initialBalance) {
        accounts = new double[numberOfAccount];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount) {
            wait();
        }

        this.accounts[from] -= amount;
        this.accounts[to] += amount;

        notifyAll();

        System.out.printf(Thread.currentThread()+ "%10.2f from %d to %d", amount, from, to);
        System.out.println();
        System.out.printf("Total balance: %10.2f", getTotalBalance());
        System.out.println();

    }

    private double getTotalBalance() {
        return Arrays.stream(this.accounts).sum();
    }

    public int size() {
        return accounts.length;
    }
}
