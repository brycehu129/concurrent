package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin1;

/**
 * @author huff
 * @date 2020/3/24 18:39
 */

/**
 * 读读共享
 *
 * 两个线程几乎同时进入lock()方法后面的代码，使用lock.readLock()可以提高程序运行效率，运行多个线程同时执行lock()方法后面的代码
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
