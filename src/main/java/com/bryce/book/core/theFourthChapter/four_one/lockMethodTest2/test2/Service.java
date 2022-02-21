package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest2.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huff
 * @date 2020/3/24 16:50
 */

/**
 * 方法 boolean hasWaiters(Condition condition)的作用是查询是否有线程正在等待与此锁定相关的condition条件
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有没有线程正在等待newCondition？"+lock.hasWaiters(newCondition)+" 线程数是多少？"+lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
