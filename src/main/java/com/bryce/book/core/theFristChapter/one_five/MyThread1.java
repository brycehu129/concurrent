package com.bryce.book.core.theFristChapter.one_five;

/**
 * @author huff
 * @date 2019/12/2 22:39
 */


/**
 * sleep()方法:在指定的毫秒数内让当前"正在执行的线程"休眠,正在执行的线程指this.currentThread()返回的线程
 * 重点：this
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName()+" begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread1 myThread=new MyThread1();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread.run();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
