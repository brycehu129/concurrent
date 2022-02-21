package com.bryce.book.core.theFourthChapter.four_one.ConditionTestManyToMany;

/**
 * @author huff
 * @date 2020/3/24 15:45
 */
public class MyThreadA extends Thread {
    private MyService service;

    public MyThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}
