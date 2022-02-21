package com.bryce.book.core.theSixthChapter.six_five.singleton_8;

/**
 * @author huff
 * @date 2020/3/25 15:42
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
