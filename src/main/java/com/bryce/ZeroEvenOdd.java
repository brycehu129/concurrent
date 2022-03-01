package com.bryce;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author bryce
 * @version 1.0.0
 * @Description 1116. 打印零与奇偶数
 *  还可以采取Thread.yield方法进行控制
 */
class ZeroEvenOdd {
    private int n;
    private Semaphore s0 = new Semaphore(1);
    private Semaphore s1 = new Semaphore(0);
    private Semaphore s2 = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            s0.acquire();
            printNumber.accept(0);
            if (i%2==1){
                s1.release();
            }else {
                s2.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i=i+2) {
            s2.acquire();
            printNumber.accept(i);
            s0.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i=i+2) {
            s1.acquire();
            printNumber.accept(i);
            s0.release();
        }
    }
}
