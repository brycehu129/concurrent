package com.bryce.book.core.theFristChapter.one_two.t2;

/**
 * @author huff
 * @date 2019/11/16 16:58
 */


/**
 * 实现多线程编程的两种方式
 */

//第二种：实现Runnable接口
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("运行中！");
    }

    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();  //父类引用指向子类对象
        //也可传入一个Thread类的对象，因为Thread类也实现了Runnable接口，这样便可以将Thread对象中的run（）方法交给其他线程来进行调用
        Thread thread=new Thread(runnable);  //创建一个线程
        thread.start();
        System.out.println("运行结束！");
    }
}
