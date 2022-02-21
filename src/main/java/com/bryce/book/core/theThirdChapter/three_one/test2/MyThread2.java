package com.bryce.book.core.theThirdChapter.three_one.test2;

/**
 * @author huff
 * @date 2020/3/19 15:59
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始      wait time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束      wait time=" + System.currentTimeMillis());
        }
    }
}
