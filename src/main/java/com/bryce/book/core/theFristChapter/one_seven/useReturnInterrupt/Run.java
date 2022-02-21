package com.bryce.book.core.theFristChapter.one_seven.useReturnInterrupt;

/**
 * @author huff
 * @date 2020/3/16 14:34
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
