package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin3;

/**
 * @author huff
 * @date 2020/3/24 18:39
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
