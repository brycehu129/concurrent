package com.bryce.book.core.theSecondChapter.two_two.synBlockString2;

/**
 * @author huff
 * @date 2020/3/17 17:30
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.b();
    }
}
