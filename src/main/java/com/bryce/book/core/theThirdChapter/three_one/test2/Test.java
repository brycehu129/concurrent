package com.bryce.book.core.theThirdChapter.three_one.test2;

/**
 * @author huff
 * @date 2020/3/19 16:02
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1=new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2=new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
