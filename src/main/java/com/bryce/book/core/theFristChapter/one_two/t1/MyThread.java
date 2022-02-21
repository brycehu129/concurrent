package com.bryce.book.core.theFristChapter.one_two.t1;

/**
 * @author huff
 * @date 2019/11/16 16:05
 */

/**
 * 实现多线程编程的两种方式
 */

//第一种：继承Thread类(即重写Thread类的run方法)   Thread类其实也是实现了Runnable接口
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread1");
    }


    //并不会由于先调用start()方法而先输出MyThread，即使用多线程时，代码的运行结果与代码执行顺序或调用顺序无关-----异步
    //原因是CPU是以随机的时间来调用子线程的run方法的
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();   //start方法只能调用一次，多次调用会有java.lang.IllegalThreadStateException异常
        //myThread.start();
        System.out.println("运行结束！");
    }
}
