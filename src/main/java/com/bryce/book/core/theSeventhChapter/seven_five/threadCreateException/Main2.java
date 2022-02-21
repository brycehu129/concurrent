package com.bryce.book.core.theSeventhChapter.seven_five.threadCreateException;

/**
 * @author huff
 * @date 2020/3/27 0:46
 *
 * 方法setUncaughtExceptionHandler()的作用是对指定的线程对象设置默认的线程处理器
 */
public class Main2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程："+t.getName()+" 出现了异常:");
                e.printStackTrace();
            }
        });
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
