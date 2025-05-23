package org.practice.assessment;

import java.util.concurrent.CountDownLatch;

public class CarConcurrency {
//    There are n racing cars, let them all be ready on the starting line,
//    start at the same time, use Java multi-threading technology to simulate this kind of scene.
    public static void main(String[] args) {
            start(5);
    }

    public static void start(int numberOfCars) {
        CountDownLatch readyLatch = new CountDownLatch(numberOfCars);
        CountDownLatch startSignal = new CountDownLatch(1);
        for (int i = 0; i < numberOfCars; i++) {
            int carNumber = i;
            Runnable task = () -> {
                try {
                    System.out.println("car"+ carNumber +" is ready");
                    readyLatch.countDown();
                    startSignal.await();
                    System.out.println("car"+ carNumber +" is running");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            new Thread(task).start();
        }

        try {
            readyLatch.await();
            System.out.println("All cars is ready");
            startSignal.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
