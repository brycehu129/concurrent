package com.bryce.book.core.theFristChapter.one_six;

/**
 * @author huff
 * @date 2019/12/2 22:51
 */


/**
 * getId():取得线程的唯一标识
 */
public class Test {
    public static void main(String[] args) {
        Thread runThread=Thread.currentThread();
        System.out.println(runThread.getName()+"  "+runThread.getId());
    }
}
