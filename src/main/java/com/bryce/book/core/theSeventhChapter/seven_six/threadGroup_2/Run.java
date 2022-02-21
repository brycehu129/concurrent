package com.bryce.book.core.theSeventhChapter.seven_six.threadGroup_2;

/**
 * @author huff
 * @date 2020/3/27 1:03
 *
 *
 * 其中一个线程出现异常，其他线程全部停止
 *
 * 需要注意的是，使用自定义java.lang.ThreadGroup线程组，并且重写uncaughtException方法处理组内线程中断行为时，
 * 每个线程对象中的run()方法内部都不要有异常catch语句，如果有catch语句，则public void uncaughtException(Thread t, Throwable e)不执行
 */
public class Run {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group,"线程"+(i+1),"1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group,"报错线程","a");
        newT.start();
    }
}
