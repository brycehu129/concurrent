package com.bryce.book.core.theSecondChapter.two_three.t99;

/**
 * @author huff
 * @date 2020/3/18 17:15
 */


/**
 * 运行结果是main线程一直在处理while循环，根本无法结束
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
