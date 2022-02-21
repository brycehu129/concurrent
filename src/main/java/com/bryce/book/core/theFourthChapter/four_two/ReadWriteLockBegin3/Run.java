package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin3;

/**
 * @author huff
 * @date 2020/3/24 18:39
 */

/**
 * 读写互斥
 *
 * "读写"操作是互斥的
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
