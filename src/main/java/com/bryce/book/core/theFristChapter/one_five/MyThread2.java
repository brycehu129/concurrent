package com.bryce.book.core.theFristChapter.one_five;

/**
 * @author huff
 * @date 2019/12/2 22:47
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName()+" begin ="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end ="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread2 myThread=new MyThread2();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread.start();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
