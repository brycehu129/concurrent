package com.bryce.book.core.theSeventhChapter.seven_two.getGroupParent;

/**
 * @author huff
 * @date 2020/3/26 23:00
 *
 * 获取根线程组
 *
 * 结果说明：JVM的根线程组就是system，再取其父线程组则出现空指针异常
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("线程："+Thread.currentThread().getName()+" 所在的线程组名为："+Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程所在的线程组的父线程组的名称是："+Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："+Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
