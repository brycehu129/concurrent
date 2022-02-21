package com.bryce.book.core.theSecondChapter.two_two.synBlockMoreObjectOneLock;

/**
 * @author huff
 * @date 2020/3/18 1:28
 */

/**
 * 同步synchronized(class)代码块的作用其实和synchronized static方法的作用一样
 */
public class Service {
    public static void printA(){
        synchronized (Service.class){
            try {
                System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
                Thread.sleep(3000);
                System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB(){
        synchronized (Service.class){
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
            System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");
        }
    }
}
