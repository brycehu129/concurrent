package com.bryce.book.core.theSecondChapter.two_one.synchronizedMethodLockObject2;

/**
 * @author huff
 * @date 2020/3/17 14:43
 */

/**
 * 虽然线程A先持有了object对象的锁，但线程B完全可以异步调用非synchronized类型的方法;
 * 倘若俩方法都为synchronized修饰的方法，那么当线程A持有object对象的锁后，线程B则需等待，也就是同步
 * 这里也就是synchronize取得的锁都是对象锁
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
