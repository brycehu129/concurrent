package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest3.test1;

/**
 * @author huff
 * @date 2020/3/24 16:57
 */


import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean isFair()的作用是判断是不是公平锁
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
            System.out.println("公平锁情况:"+lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
