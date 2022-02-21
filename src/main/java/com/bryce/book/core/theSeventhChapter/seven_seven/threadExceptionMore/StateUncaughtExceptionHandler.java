package com.bryce.book.core.theSeventhChapter.seven_seven.threadExceptionMore;

/**
 * @author huff
 * @date 2020/3/27 1:15
 */
public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
