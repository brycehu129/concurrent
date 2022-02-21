package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest3.test2;

/**
 * @author huff
 * @date 2020/3/24 17:02
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean isHeldByCurrentThread()的作用是查询当前线程是否保持此锁定
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}
