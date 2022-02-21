package com.bryce.book.core.theSecondChapter.two_two.test2;

/**
 * @author huff
 * @date 2020/3/18 0:43
 */
public class MyObject {
    synchronized public void speedPrintString(){
        System.out.println("speedPrintString getLock time="+System.currentTimeMillis()+" run ThreadName="+Thread.currentThread().getName());
        System.out.println("---------------------");
        System.out.println("speedPrintString releaseLock time="+System.currentTimeMillis()+" run ThreadName="+Thread.currentThread().getName());
    }
}
