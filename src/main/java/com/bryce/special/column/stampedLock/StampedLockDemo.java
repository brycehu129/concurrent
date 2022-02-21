package com.bryce.special.column.stampedLock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 20:36
 * @description todo
 */
public class StampedLockDemo {

    public static void main(String[] args) {
        final StampedLock sl = new StampedLock();

        // 获取/释放悲观读锁示意代码
        long stamp1 = sl.readLock();

        try {
            //省略业务相关代码
        } finally {
            sl.unlockRead(stamp1);
        }

        // 获取/释放写锁示意代码
        long stamp2 = sl.writeLock();
        try {
            //省略业务相关代码
        } finally {
            sl.unlockWrite(stamp2);
        }
    }


}
