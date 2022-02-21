package com.bryce.book.core.theSeventhChapter.seven_one.stateTest1;

/**
 * @author huff
 * @date 2020/3/26 16:44
 */

/**
 * 构造方法中打印出的状态其实是main主线程的状态为RUNNABLE
 */
public class Run {
    //NEW
    //RUNNABLE
    //TERMINATED
    //BLOCKED
    //WAITING
    //TIMED_WAITING
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            System.out.println("main方法中的状态1："+t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
