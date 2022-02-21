package com.bryce.book.core.theFourthChapter.four_one.z3_ok;

/**
 * @author huff
 * @date 2020/3/24 14:26
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
