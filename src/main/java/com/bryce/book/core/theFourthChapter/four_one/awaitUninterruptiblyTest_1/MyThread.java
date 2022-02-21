package com.bryce.book.core.theFourthChapter.four_one.awaitUninterruptiblyTest_1;

/**
 * @author huff
 * @date 2020/3/24 17:45
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
