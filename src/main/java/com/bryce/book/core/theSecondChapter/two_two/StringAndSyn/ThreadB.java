package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn;

/**
 * @author huff
 * @date 2020/3/18 1:38
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
    }
}
