package com.bryce.book.core.theSecondChapter.two_three.t16;

/**
 * @author huff
 * @date 2020/3/18 17:31
 */

/**
 * 此时RunThread中的"线程已经被停止"从未被执行；
 * 原因是在启动RunThread.java时，变量private boolean isRunning=true;存在于公共堆栈及线程的私有堆栈中；
 * 在JVM被设置为 -server模式时为了线程运行的效率，线程一直在私有堆栈中取得isRunning的值是true；
 * 而代码thread.setRunning(false);虽然被执行，更新的却是公共堆栈中的isRunning变量的值为false，所以一直都是死循环
 *
 * 问题：私有堆栈中的值和公共堆栈中的值不同步
 * 解决方法：使用volatile关键字，主要作用就是当线程访问isRunning这个变量时，强制性的从公共堆栈中进行取值
 */
public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread=new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
