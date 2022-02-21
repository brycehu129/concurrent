package com.bryce.book.core.theSeventhChapter.seven_one.stateTest4;

/**
 * @author huff
 * @date 2020/3/26 16:53
 */

/**
 * 执行wait()方法后线程的状态枚举值就是WAITING
 */
public class Run {
    //NEW
    //RUNNABLE
    //TERMINATED
    //BLOCKED
    //WAITING
    //TIMED_WAITING
    public static void main(String[] args){
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
