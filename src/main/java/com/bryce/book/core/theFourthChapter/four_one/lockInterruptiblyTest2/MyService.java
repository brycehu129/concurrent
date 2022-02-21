package com.bryce.book.core.theFourthChapter.four_one.lockInterruptiblyTest2;

/**
 * @author huff
 * @date 2020/3/24 17:19
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 lockInterruptibly()的作用是：如果当前线程未被中断，则获取锁定，如果已经被中断则出现异常
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin "+Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE/10; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock   end "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
