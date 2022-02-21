package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin2;

/**
 * @author huff
 * @date 2020/3/24 18:31
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(){
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
                Thread.sleep(10000);
            }  finally {
                lock.writeLock().unlock();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
