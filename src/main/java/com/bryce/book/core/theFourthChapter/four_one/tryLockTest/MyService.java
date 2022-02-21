package com.bryce.book.core.theFourthChapter.four_one.tryLockTest;

/**
 * @author huff
 * @date 2020/3/24 17:29
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean tryLock()的作用是，仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod(){
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }
}
