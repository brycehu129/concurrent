package com.bryce.book.core.theFristChapter.one_ten.t18;

/**
 * @author huff
 * @date 2020/3/16 15:24
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread2= new MyThread2();
        thread2.start();
    }
}
