package com.bryce.book.core.theFristChapter.one_four;

/**
 * @author huff
 * @date 2019/12/1 21:52
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        System.out.println("begin =="+myThread.isAlive());
        myThread.start();
       // Thread.sleep(5000);     //执行了run()方法后，线程就已经终止，出于非活跃状态
        System.out.println("end =="+myThread.isAlive());
    }
}
