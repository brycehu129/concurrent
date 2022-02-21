package com.bryce.special.column.stampedLock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 20:56
 * @description StampedLock 读写模板
 */
public class StampStandardTemplate {

    final StampedLock sl = new StampedLock();

    public void Read(){
        // 乐观读
        long stamp = sl.tryOptimisticRead();
        // 读入方法局部变量
        //......
        // 校验stamp
        if (!sl.validate(stamp)) {
            // 升级为悲观读锁
            stamp = sl.readLock();
            try {
                // 读入方法局部变量
                //.....
            } finally {
                //释放悲观读锁
                sl.unlockRead(stamp);
            }
        }
        //使用方法局部变量执行业务操作
        //......
    }

    public void write(){
        long stamp = sl.writeLock();
        try {
            // 写共享变量
            //......
        } finally {
            sl.unlockWrite(stamp);
        }
    }

}
