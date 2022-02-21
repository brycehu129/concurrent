package com.bryce.book.core.theSecondChapter.two_two.synMoreObjectStaticOneLock;

/**
 * @author huff
 * @date 2020/3/18 1:18
 */

/**
 * 验证：class锁可以对类的所有对象实例起作用
 */
public class Service {
    synchronized public static void printA(){
        try {
            System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB(){
        System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");
    }
}
