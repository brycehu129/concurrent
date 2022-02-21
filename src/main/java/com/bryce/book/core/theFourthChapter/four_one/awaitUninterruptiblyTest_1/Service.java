package com.bryce.book.core.theFourthChapter.four_one.awaitUninterruptiblyTest_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author huff
 * @date 2020/3/24 17:43
 */


/**
 * 方法awaitUninterruptibly()的使用
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait   end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
    }
}
