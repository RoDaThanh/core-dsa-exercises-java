package org.practice.thread;

import java.util.Arrays;

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

        System.out.printf(Thread.currentThread()+ "%10.2f from %d to %d%n", amount, from, to);
        System.out.printf("Total balance: %10.2f%n", getTotalBalance());
        notifyAll();
    }

    private double getTotalBalance() {
        return Arrays.stream(this.accounts).sum();
    }

    public int size() {
        return accounts.length;
    }
}
