package org.practice.thread;

import java.util.Arrays;

public class Bank {

    private double[] accounts;

    public Bank(int numberOfAccount, double initialBalance) {
        accounts = new double[numberOfAccount];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        if (this.accounts[from] < amount) return;
        this.accounts[from] -= amount;
        this.accounts[to] += amount;
        System.out.printf(Thread.currentThread()+ "%10.2f from %d to %d", amount, from, to);
        System.out.println();
        System.out.printf("Total balance: %10.2f", getTotalBalance());
        System.out.println();
    }

    private double getTotalBalance() {
        return Arrays.stream(this.accounts).sum();
    }
}
