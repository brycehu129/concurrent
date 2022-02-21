package com.bryce.book.core.theSeventhChapter.seven_five.threadCreateException;

/**
 * @author huff
 * @date 2020/3/27 0:44
 */

/**
 * 运行后控制台输出空指针异常，在JAVA中，可以使用UncaughtExceptionHandler类对发生的异常进行有效的处理
 */
public class Main1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
