package com.bryce.book.core.theSecondChapter.two_two.deadLockTest;

/**
 * @author huff
 * @date 2020/3/18 16:00
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1=new DealThread();
            t1.setFlag("a");
            Thread thread1=new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2=new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
