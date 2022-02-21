package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest1.test3;

/**
 * @author huff
 * @date 2020/3/24 16:26
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 int getWaitQueueLength(Condition condition)的作用是返回等待与此锁定相关的给定条件Condition的线程估计数
 * 比如有5个线程，每个线程都执行了同一个condition对象的await()方法，则调用getWaitQueueLength(Condition condition)方法时返回的int值是5
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(condition)+"个线程正在等待Condition");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
