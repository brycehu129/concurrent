package com.bryce.book.core.theSixthChapter.six_two.singleton_5;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */

/**
 * 使用双重检查锁功能，成功地解决了“懒汉模式”遇到多线程的问题
 * DCL也是大多数多线程结合单例模式使用的解决方案
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
