package com.bryce.book.core.theFristChapter.one_eight.suspend_resume_LockStop;

/**
 * @author huff
 * @date 2020/3/16 14:58
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
