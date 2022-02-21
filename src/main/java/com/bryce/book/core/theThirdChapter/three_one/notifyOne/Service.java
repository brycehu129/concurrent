package com.bryce.book.core.theThirdChapter.three_one.notifyOne;

/**
 * @author huff
 * @date 2020/3/19 16:46
 */

/**
 * 验证：调用方法notify()一次只随机通知一个线程进行唤醒
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait() ThreadName="+Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
