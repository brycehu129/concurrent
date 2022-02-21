package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest2.test1;

/**
 * @author huff
 * @date 2020/3/24 16:44
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean hasQueuedThread(Thread thread)的作用是查询指定的线程是否正在等待获取此锁定
 * 方法 boolean hasQueuedThreads()的作用是查询是否有线程正在等待获取此锁定
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
