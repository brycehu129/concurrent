package com.bryce.book.core.theFourthChapter.four_one.UseConditionWaitNotifyError;

/**
 * @author huff
 * @date 2020/3/24 14:21
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
