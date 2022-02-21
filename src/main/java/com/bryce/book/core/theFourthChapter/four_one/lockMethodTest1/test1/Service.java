package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huff
 * @date 2020/3/24 16:11
 */

/**
 * 方法 int getHoldCount()的作用是查询当前线程保持此锁定的个数，也就是调用lock()方法的次数
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());

        } finally {
            lock.unlock();
        }
    }
}
