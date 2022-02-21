package com.bryce.book.core.theSecondChapter.two_two.doubleSynBlockOneTwo;

/**
 * @author huff
 * @date 2020/3/17 16:45
 */
public class ThreadA extends Thread {
    private ObjectService service;

    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
