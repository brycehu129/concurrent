package com.bryce.book.core.theFristChapter.one_eleven.daemonThread;

/**
 * @author huff
 * @date 2020/3/16 15:56
 */

/**
 * 守护线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread =new MyThread();
            thread.setDaemon(true);  //将thread线程设为main线程的守护线程，即main方法结束，守护线程也被杀死(需要注意的是需要在start前设置)
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
