package com.bryce.book.core.theSeventhChapter.seven_one.stateTest3;

/**
 * @author huff
 * @date 2020/3/26 16:53
 *
 * 验证BLOCKED
 */
public class Run {
    //NEW
    //RUNNABLE
    //TERMINATED
    //BLOCKED
    //WAITING
    //TIMED_WAITING
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        System.out.println("main方法中的t2状态："+t2.getState());
    }
}
