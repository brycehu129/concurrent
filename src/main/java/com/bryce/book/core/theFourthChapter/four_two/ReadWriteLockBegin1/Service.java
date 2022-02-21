package com.bryce.book.core.theFourthChapter.four_two.ReadWriteLockBegin1;

/**
 * @author huff
 * @date 2020/3/24 18:31
 */

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 类ReentrantLock具有完全互斥排他的效果，即同一时间只有一个线程在执行Reentrant.lock()方法后面的任务
 * 而读写锁ReentrantReadWriteLock类在某些不需要操作实例变量的方法中，可以提升方法的代码运行速度
 *
 * 读写锁有两个锁：
 * 1.读操作相关的锁，也称为共享锁
 * 2.写操作相关的锁，也叫排他锁
 *
 * 特点：多个读锁之间不互斥，读锁与写锁互斥，写锁与写锁互斥
 * 即多个Thread可以同时进行读取操作，但是同一时刻只允许一个Thread进行写入操作
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
                Thread.sleep(10000);
            }  finally {
                lock.readLock().unlock();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
