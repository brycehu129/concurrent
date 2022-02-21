package com.bryce.book.core.theSecondChapter.two_three.AtomicIntegerTest;

/**
 * @author huff
 * @date 2020/3/18 18:03
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 除了在i++操作时使用synchronized关键字实现同步外，还可以使用AtomicInteger原子类进行实现
 * 原子操作是不能分割的整体，没有其他线程能够中断或检查正在原子操作中的变量；
 * 一个原子(atomic）类型就是一个原子操作可用的类型，它可以在没有锁的情况下做到线程安全
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
