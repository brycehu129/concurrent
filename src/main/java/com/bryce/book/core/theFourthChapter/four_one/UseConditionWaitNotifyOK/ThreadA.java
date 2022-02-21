package com.bryce.book.core.theFourthChapter.four_one.UseConditionWaitNotifyOK;

/**
 * @author huff
 * @date 2020/3/24 14:40
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
