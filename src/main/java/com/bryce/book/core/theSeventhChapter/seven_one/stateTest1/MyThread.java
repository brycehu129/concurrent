package com.bryce.book.core.theSeventhChapter.seven_one.stateTest1;

/**
 * @author huff
 * @date 2020/3/26 16:42
 *
 * 验证NEW、RUNNABLE、TERMINATED
 */

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法中的状态："+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态："+Thread.currentThread().getState());
    }
}
