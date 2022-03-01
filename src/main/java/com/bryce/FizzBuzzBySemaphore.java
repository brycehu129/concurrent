package com.bryce;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author bryce
 * @version 1.0.0
 * @Description TODO
 */
class FizzBuzzBySemaphore {
    private int n;
    private Semaphore s0 = new Semaphore(1);
    private Semaphore s1 = new Semaphore(0);
    private Semaphore s2 = new Semaphore(0);
    private Semaphore s3 = new Semaphore(0);

    public FizzBuzzBySemaphore(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            s1.acquire();
            printFizz.run();
            s0.release();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            s2.acquire();
            printBuzz.run();
            s0.release();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            s3.acquire();
            printFizzBuzz.run();
            s0.release();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            s0.acquire();
            if (i % 3 == 0 && i % 5 == 0) {
                s3.acquire();
            } else if (i % 3 == 0) {
                s1.acquire();
            } else if (i % 5 == 0) {
                s2.acquire();
            } else {
                printNumber.accept(i);
            }
        }
    }
}
