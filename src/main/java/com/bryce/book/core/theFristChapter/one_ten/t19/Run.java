package com.bryce.book.core.theFristChapter.one_ten.t19;

/**
 * @author huff
 * @date 2020/3/16 15:36
 */

/**
 * 优先级具有规则性，线程的优先级与代码执行顺序无关
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
