package com.bryce.book.core.theFourthChapter.four_one.tryLock_param;

/**
 * @author huff
 * @date 2020/3/24 17:34
 */

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean tryLock(long timeout,TimeUnit unit)的作用是，如果锁定在给定等待时间内没有给另一个线程保持，
 * 且当前线程未被中断，则获取该锁定
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod(){
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println("      "+Thread.currentThread().getName()+"获得锁的时间："+System.currentTimeMillis());
                Thread.sleep(10000);
            }else {
                System.out.println("      "+Thread.currentThread().getName()+"没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
