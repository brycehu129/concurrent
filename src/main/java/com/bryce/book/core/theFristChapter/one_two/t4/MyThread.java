package com.bryce.book.core.theFristChapter.one_two.t4;

/**
 * @author huff
 * @date 2019/11/16 17:17
 */

/**
 * 自定义线程中的实例变量针对其他线程可以有共享和不共享之分
 * 以下介绍共享数据的情况
 */
public class MyThread extends Thread {
    private int count=5;

    //synchronized可以加在任意变量及方法上，加锁的代码称为"互斥区"或"临界区"
    @Override
    /*synchronized*/ public void run() {
        super.run();
        count--;
        System.out.println("由"+this.currentThread().getName()+" 计算, count="+count);
    }


    //非线程安全：主要是指多个线程对同一个对象中的同一个实例变量进行操作时会出现值被更改、值不同步的情况，进而影响程序的执行流程
    /**
     * 由于其创建多个Thread对象调用同一个shareData线程的run（）方法，其实就是对同一个count进行操作
     * 但这样会产生线程安全问题  即 JVM执行i-- 通常分为三步：(1) 取得i的值 (2) 计算i-1 (3) 对i进行赋值
     * 当多个线程同时访问，就会出现非线程安全问题(一个方法可由多个线程对象同时调用)
     * 故需要进行同步操作，即在run()方法前加上synchronized关键字
     */

    public static void main(String[] args) {
        MyThread shareData=new MyThread();
        Thread a=new Thread(shareData,"A");
        Thread b=new Thread(shareData,"B");
        Thread c=new Thread(shareData,"C");
        Thread d=new Thread(shareData,"D");
        Thread e=new Thread(shareData,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
