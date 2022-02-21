package com.bryce.special.column.stampedLock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 21:00
 * @description todo
 */
public class ErrorExample2 {


    private double x, y;
    final StampedLock sl = new StampedLock();

    // 存在问题的方法
    void moveIfAtOrigin(double newX, double newY) {
        long stamp = sl.readLock();
        try {
            while (x == 0.0 && y == 0.0) {
                long ws = sl.tryConvertToWriteLock(stamp);
                if (ws != 0L) {
                    x = newX;
                    y = newY;
                    //stamp=ws  //锁升级成功的时候，最后没有释放最新的写锁
                    break;
                } else {
                    sl.unlockRead(stamp);
                    stamp = sl.writeLock();
                }
            }
        } finally {
            sl.unlock(stamp);
        }

    }
}
