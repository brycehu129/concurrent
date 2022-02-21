package com.bryce.book.core.theSecondChapter.two_one.synLockIn_1;

/**
 * @author huff
 * @date 2020/3/17 15:08
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
