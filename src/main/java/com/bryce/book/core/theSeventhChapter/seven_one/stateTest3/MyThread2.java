package com.bryce.book.core.theSeventhChapter.seven_one.stateTest3;

/**
 * @author huff
 * @date 2020/3/26 16:49
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
