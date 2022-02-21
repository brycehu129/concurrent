package com.bryce.book.core.theSeventhChapter.seven_two.mainGroup;

/**
 * @author huff
 * @date 2020/3/26 23:04
 *
 * 线程组里加线程组
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("线程组名称："+Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量："+ Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("------");
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println("当前线程名称："+threads[i].getName());
        }
        System.out.println("------");
        System.out.println("线程组中线程组的数量-加之前:"+Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(),"newGroup");
        System.out.println("线程组中线程组的数量-加之后："+Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称："+Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
