package com.bryce.book.core.theSeventhChapter.seven_six.threadGroup_1;

/**
 * @author huff
 * @date 2020/3/27 0:54
 *
 * 默认情况下，线程组内的一个线程出现异常不会影响其他线程的运行
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group,"线程"+(i+1),"1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group,"报错线程---------------------","a");
        newT.start();

    }
}
