package com.bryce;

import java.util.function.IntConsumer;

/**
 * @author bryce
 * @version 1.0.0
 * @Description
 */
class FizzBuzzByYield {
    private int n;
    private volatile int state;

    public FizzBuzzByYield(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            while (state != 1) {
                Thread.yield();
            }
            printFizz.run();
            state = 0;
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            while (state != 2) {
                Thread.yield();
            }
            printBuzz.run();
            state = 0;
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            while (state != 3) {
                Thread.yield();
            }
            printFizzBuzz.run();
            state = 0;
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            while (state != 0) {
                Thread.yield();
            }
            if (i % 3 == 0 && i % 5 == 0) {
                state = 3;
            } else if (i % 3 == 0) {
                state = 1;
            } else if (i % 5 == 0) {
                state = 2;
            } else {
                printNumber.accept(i);
            }
        }
    }
}
