package com.bryce.book.core.theSecondChapter.two_two.synBlockString;

/**
 * @author huff
 * @date 2020/3/17 17:16
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
        service.setUsernamePassword("a","aa");
    }
}
