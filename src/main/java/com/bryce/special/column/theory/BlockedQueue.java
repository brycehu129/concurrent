package com.bryce.special.column.theory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/8 13:54
 * @description META模型解决同步问题
 */

public class BlockedQueue<T>{

    final BlockingQueue<T> queue = new ArrayBlockingQueue<T>(10);

    final Lock lock =
            new ReentrantLock();
    // 条件变量：队列不满
    final Condition notFull =
            lock.newCondition();
    // 条件变量：队列不空
    final Condition notEmpty =
            lock.newCondition();

    // 入队
    void enq(T x) throws InterruptedException {
        lock.lock();
        try {
            while (queue.remainingCapacity()==0){
                // 等待队列不满
                notFull.await();
            }
            // 省略入队操作...
            //入队后,通知可出队
            notEmpty.signal();
        }finally {
            lock.unlock();
        }
    }
    // 出队
    void deq() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()){
                // 等待队列不空
                notEmpty.await();
            }
            // 省略出队操作...
            //出队后，通知可入队
            notFull.signal();
        }finally {
            lock.unlock();
        }
    }
}
