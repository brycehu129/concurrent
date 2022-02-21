package com.bryce.book.core.theFristChapter.one_three.currentThreadExt;

/**
 * @author huff
 * @date 2019/12/1 21:39
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate---end");
    }

    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t1=new Thread(c);
        t1.setName("A");
        //t1.start();  //此时run方法是自动调用的方法，可参考Run1，故run()中Thread.currentThread().getName()=A
        t1.run();
    }
}
