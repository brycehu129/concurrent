package com.bryce.book.core.theFourthChapter.four_one.ConditionTestMoreMethod;

/**
 * @author huff
 * @date 2020/3/24 14:09
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
