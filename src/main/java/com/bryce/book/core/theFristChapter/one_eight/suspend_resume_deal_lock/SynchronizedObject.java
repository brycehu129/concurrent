package com.bryce.book.core.theFristChapter.one_eight.suspend_resume_deal_lock;

/**
 * @author huff
 * @date 2020/3/16 14:48
 */

/**
 * 公共的同步对象的独占，使得其他线程无法访问公共同步对象（另外一种独占锁的情况见suspend_resume_LockStop）
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
