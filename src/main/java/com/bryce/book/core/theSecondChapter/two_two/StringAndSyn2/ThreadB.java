package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn2;

/**
 * @author huff
 * @date 2020/3/18 1:47
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
