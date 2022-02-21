package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin4;

/**
 * @author huff
 * @date 2020/3/24 18:39
 */

/**
 * 写读互斥
 *
 * "写读"操作是互斥的
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
