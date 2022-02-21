package com.bryce.book.core.theSecondChapter.two_three.synchronizedUpdateNewValue;

/**
 * @author huff
 * @date 2020/3/18 18:28
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
