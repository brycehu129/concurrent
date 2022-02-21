package com.bryce.book.core.theSecondChapter.two_two.setNewStringTwoLock;

/**
 * @author huff
 * @date 2020/3/18 16:57
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
