package com.bryce.book.core.theFourthChapter.four_one.ReentrantLockTest;

/**
 * @author huff
 * @date 2020/3/24 14:01
 */
public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        MyThread a1=new MyThread(service);
        MyThread a2=new MyThread(service);
        MyThread a3=new MyThread(service);
        MyThread a4=new MyThread(service);
        MyThread a5=new MyThread(service);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
