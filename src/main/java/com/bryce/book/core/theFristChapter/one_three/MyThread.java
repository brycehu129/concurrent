package com.bryce.book.core.theFristChapter.one_three;

/**
 * @author huff
 * @date 2019/12/1 21:35
 */
public class MyThread extends Thread{
    public MyThread(){
        System.out.println("构造方法的打印:"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        //myThread.start();
        myThread.run();
    }




}
