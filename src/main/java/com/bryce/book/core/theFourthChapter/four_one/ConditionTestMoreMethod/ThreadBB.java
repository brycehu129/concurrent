package com.bryce.book.core.theFourthChapter.four_one.ConditionTestMoreMethod;

/**
 * @author huff
 * @date 2020/3/24 14:09
 */
public class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
