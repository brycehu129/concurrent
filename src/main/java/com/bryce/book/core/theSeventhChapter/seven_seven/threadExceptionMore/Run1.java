package com.bryce.book.core.theSeventhChapter.seven_seven.threadExceptionMore;

/**
 * @author huff
 * @date 2020/3/27 1:15
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //对象
        //myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());   //此行没有被注释前，下面设置默认的异常处理器被覆盖了

        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
