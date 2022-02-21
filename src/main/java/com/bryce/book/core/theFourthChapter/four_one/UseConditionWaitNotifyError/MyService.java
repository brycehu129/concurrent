package com.bryce.book.core.theFourthChapter.four_one.UseConditionWaitNotifyError;

/**
 * @author huff
 * @date 2020/3/24 14:15
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition实现等待/通知：错误用法与解决
 *
 *
 * 关键字synchronized与wait()和notify()/notifyAll()方法相结合可以实现等待/通知模式；
 * 类ReentrantLock也可以，但需要借助Condition对象
 *
 * Condition类有更好的灵活性，比如可以实现多路通知功能，也就是在一个Lock对象里面可以创建出多个Condition(即对象监视器)实例
 * 线程对象可以注册在指定的Condition中，从而可以有选择性的进行线程通知，在调度线程上更加灵活
 */

public class MyService {
    private Lock lock=new ReentrantLock();

    private Condition condition= lock.newCondition();

    public void await(){
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
