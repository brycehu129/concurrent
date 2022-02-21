package com.bryce.book.core.theSecondChapter.two_one.throwExceptionNoLock;

/**
 * @author huff
 * @date 2020/3/17 15:53
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
