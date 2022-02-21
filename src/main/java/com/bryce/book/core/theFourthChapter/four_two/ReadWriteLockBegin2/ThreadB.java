package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin2;

/**
 * @author huff
 * @date 2020/3/24 18:39
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
