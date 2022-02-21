package com.bryce.book.core.theFristChapter.one_two.t3;

/**
 * @author huff
 * @date 2019/11/16 17:11
 */

/**
 * 自定义线程中的实例变量针对其他线程可以有共享和不共享之分
 * 以下介绍不共享数据的情况
 */

public class MyThread extends Thread {
    private int count =5;
    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+" 计算, count="+count);
        }
    }

    public static void main(String[] args) {
        MyThread a=new MyThread("A");
        MyThread b=new MyThread("B");
        MyThread c=new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
