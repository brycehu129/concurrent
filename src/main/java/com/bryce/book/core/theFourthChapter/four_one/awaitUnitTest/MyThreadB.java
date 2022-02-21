package com.bryce.book.core.theFourthChapter.four_one.awaitUnitTest;

/**
 * @author huff
 * @date 2020/3/24 18:15
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
