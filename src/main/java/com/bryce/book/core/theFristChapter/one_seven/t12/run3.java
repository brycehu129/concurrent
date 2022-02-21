package com.bryce.book.core.theFristChapter.one_seven.t12;

/**
 * @author huff
 * @date 2019/12/2 23:14
 */

/**
 * this.interrupted()测试当前线程是否已经是中断状态，执行后具有将状态标志清除为false的功能
 * this.isInterrupted()测试当前线程是否为中断状态，但不清除状态标志
 */
public class run3 extends Thread {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1? ="+thread.isInterrupted());
            System.out.println("是否停止2? ="+thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");


    }
}
