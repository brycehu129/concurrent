package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin2;

/**
 * @author huff
 * @date 2020/3/24 18:39
 */

/**
 * 写写互斥
 *
 * 使用写锁代码lock.writeLock()的效果就是同一时间只允许一个线程执行lock()方法后面的代码
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
