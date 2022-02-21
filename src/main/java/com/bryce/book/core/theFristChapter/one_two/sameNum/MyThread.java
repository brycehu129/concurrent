package com.bryce.book.core.theFristChapter.one_two.sameNum;

/**
 * @author huff
 * @date 2019/11/30 22:39
 */
public class MyThread extends Thread {
    private int i=5;

    @Override
    /*synchronized*/ public void run() {
        //println内部实现依然先 计算出需要打印的值
        System.out.println("i="+(i--)+ " threadName="+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread run=new MyThread();
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        Thread t3=new Thread(run);
        Thread t4=new Thread(run);
        Thread t5=new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
