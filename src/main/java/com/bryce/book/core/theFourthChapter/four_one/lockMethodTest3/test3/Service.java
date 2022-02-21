package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest3.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huff
 * @date 2020/3/24 17:06
 */

/**
 * 方法 boolean isLocked()的作用是查询此锁定是否由任意线程保持
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
