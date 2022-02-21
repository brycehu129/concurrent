package com.bryce.book.core.theFourthChapter.four_one.UseConditionWaitNotifyOK;

/**
 * @author huff
 * @date 2020/3/24 14:42
 */

/**
 * 成功实现等待/通知模式
 *
 * Object类中的wait()方法相当于Condition类中的await()方法
 * Object类中的wait(long timeout)方法相当于Condition类中的await(long time,TimeUnit unit)方法
 * Object类中的notify()方法相当于Condition类中的signal()方法
 * Object类中的notify()方法相当于Condition类中的signalAll()方法
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
