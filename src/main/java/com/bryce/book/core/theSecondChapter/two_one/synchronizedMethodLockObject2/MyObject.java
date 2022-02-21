package com.bryce.book.core.theSecondChapter.two_one.synchronizedMethodLockObject2;

/**
 * @author huff
 * @date 2020/3/17 14:38
 */
public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try {
            System.out.println("begin methodB threadName="+Thread.currentThread().getName()+" begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
