package com.bryce.book.core.theSecondChapter.two_two.synStaticMethod;

/**
 * @author huff
 * @date 2020/3/18 0:58
 */

/**
 * 关键字synchronized还可以应用在static静态方法上，这样写，即是对当前的*.java文件对应的class类进行持锁;
 */
public class Service {
    synchronized public static void printA(){
        try {
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB(){
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");
    }
}
