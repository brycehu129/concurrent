package com.bryce.book.core.theFristChapter.one_ten.t18;

/**
 * @author huff
 * @date 2020/3/16 15:26
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}
