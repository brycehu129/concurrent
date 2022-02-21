package com.bryce.book.core.theSecondChapter.two_one.synLockIn_2;

/**
 * @author huff
 * @date 2020/3/17 15:45
 */

/**
 * 当存在父子类继承关系时，子类是完全可以通过“可重入锁”调用父类的同步方法
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
