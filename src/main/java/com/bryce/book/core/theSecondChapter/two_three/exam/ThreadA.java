package com.bryce.book.core.theSecondChapter.two_three.exam;

/**
 * @author huff
 * @date 2020/3/18 18:28
 */
public class ThreadA extends Thread {
    private Servi service;

    public ThreadA(Servi service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
