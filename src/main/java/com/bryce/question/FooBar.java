package com.bryce.question;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hufei
 * @date 2022/3/1 14:23
 * @description
 */
class FooBar {
    private int n;
    private ReentrantLock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private volatile boolean flag = true;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (flag==false){
                    c1.await();
                    break;
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                flag = false;
                c2.signalAll();
            }finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (flag==true){
                    c2.await();
                    break;
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                flag = true;
                c1.signalAll();
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(100);
        fooBar.foo(new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        });
        fooBar.bar(new Runnable() {
            @Override
            public void run() {
                System.out.println("bar");
            }
        });
    }
}
