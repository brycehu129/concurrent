package com.bryce.book.core.theThirdChapter.three_one.waitInterruptException;

/**
 * @author huff
 * @date 2020/3/19 16:41
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
