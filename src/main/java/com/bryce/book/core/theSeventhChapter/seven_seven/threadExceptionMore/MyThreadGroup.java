package com.bryce.book.core.theSeventhChapter.seven_seven.threadExceptionMore;

/**
 * @author huff
 * @date 2020/3/27 1:13
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组内的异常处理");
        e.printStackTrace();
    }
}
