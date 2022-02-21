package com.bryce.book.core.theSecondChapter.two_three.atomicIntegerNoSafe;

/**
 * @author huff
 * @date 2020/3/18 18:11
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
