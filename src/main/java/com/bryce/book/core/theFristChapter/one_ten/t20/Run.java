package com.bryce.book.core.theFristChapter.one_ten.t20;

/**
 * @author huff
 * @date 2020/3/16 15:45
 */

/**
 * 线程的优先级具有随机性（线程优先级与打印顺序无关）
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 =new MyThread1();
            thread1.setPriority(5);
            thread1.start();
            MyThread2 thread2 =new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }
}
