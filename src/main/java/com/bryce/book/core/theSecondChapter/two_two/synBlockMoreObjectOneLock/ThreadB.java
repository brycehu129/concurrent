package com.bryce.book.core.theSecondChapter.two_two.synBlockMoreObjectOneLock;

/**
 * @author huff
 * @date 2020/3/18 1:31
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
