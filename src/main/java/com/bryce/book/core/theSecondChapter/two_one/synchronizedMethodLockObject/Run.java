package com.bryce.book.core.theSecondChapter.two_one.synchronizedMethodLockObject;

/**
 * @author huff
 * @date 2020/3/17 14:32
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
