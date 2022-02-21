package com.bryce.book.core.theSixthChapter.six_two.singleton_2;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */

/**
 * 在多线程环境中结合“错误的单例模式”创建出多例，并不是单例
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
