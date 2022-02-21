package com.bryce.book.core.theFourthChapter.four_one.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huff
 * @date 2020/3/24 13:58
 */
public class MyService {
    private Lock lock=new ReentrantLock();

    public void testMethod(){
        lock.lock();   //获取锁
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName());
        }
        lock.unlock();  //释放锁
    }
}
