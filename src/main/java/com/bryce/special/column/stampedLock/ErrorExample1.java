package com.bryce.special.column.stampedLock;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.StampedLock;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 20:52
 * @description 如果线程阻塞在 StampedLock 的 readLock() 或者 writeLock() 上时，此时调用该阻塞线程的 interrupt() 方法，会导致 CPU 飙升
 */
public class ErrorExample1 {

    public static void main(String[] args) throws InterruptedException {
        final StampedLock lock
                = new StampedLock();
        Thread T1 = new Thread(() -> {
            // 获取写锁
            lock.writeLock();
            // 永远阻塞在此处，不释放写锁
            LockSupport.park();
        });
        T1.start();
        // 保证T1获取写锁
        Thread.sleep(100);
        Thread T2 = new Thread(() ->
                //阻塞在悲观读锁
                lock.readLock()
        );
        T2.start();
        // 保证T2阻塞在读锁
        Thread.sleep(100);
        //中断线程T2
        //会导致线程T2所在CPU飙升
        T2.interrupt();
        T2.join();   //todo  查看线程情况是否CPU飙升
    }

}
