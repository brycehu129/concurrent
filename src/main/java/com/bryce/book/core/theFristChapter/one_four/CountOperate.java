package com.bryce.book.core.theFristChapter.one_four;

/**
 * @author huff
 * @date 2019/12/1 21:57
 */

/**
 * isAlive():活动状态是指线程已经启动且尚未终止
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());//true  main线程已经启动且尚未终止
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());  //false 因为线程Thread-0的run（）方法并未被调用
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName()); //A（类似于main）  线程自动被调用
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive()); //true A线程已经启动且尚未终止
        System.out.println("this.getName()="+this.getName());
        //以构造参数传递给Thread对象时，会有一点差异(若想看出效果，可由t1.start()换成c.start())
        System.out.println("this.isAlive()="+this.isAlive());  //此时this代指CountOperate对象，此对象并未调用start方法，而是由Thread对象t1调用的start方法
        System.out.println("CountOperate---end");
    }

    public static void main(String[] args) {
        CountOperate c=new CountOperate();
        Thread t1=new Thread(c);
        System.out.println("main begin t1 isAlive="+t1.isAlive());  //t1的run()方法并未执行
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());  //t1此时出于活跃状态
    }
}
