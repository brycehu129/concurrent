package com.bryce.book.core.theSecondChapter.two_three.t10;

/**
 * @author huff
 * @date 2020/3/18 17:15
 */

/**
 * 此处虽然解决了t99中的死循环，但运行在 -server服务器模式中64bit的JVM时，会出现死循环，可以使用volatile关键字解决
 * 关键字volatile的作用是强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
