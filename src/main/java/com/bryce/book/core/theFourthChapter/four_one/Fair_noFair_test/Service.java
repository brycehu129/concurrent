package com.bryce.book.core.theFourthChapter.four_one.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huff
 * @date 2020/3/24 16:00
 */

/**
 * 公平锁与非公平锁
 *
 * 公平锁：线程获取锁的顺序是按照加锁的顺序来分配的，即先来先得的FIFO先进先出顺序
 * 非公平锁：一种获取锁的抢占机制，是随机获取锁的
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
