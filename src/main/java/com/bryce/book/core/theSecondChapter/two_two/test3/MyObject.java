package com.bryce.book.core.theSecondChapter.two_two.test3;

/**
 * @author huff
 * @date 2020/3/18 0:53
 */
public class MyObject {
    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString getLock time="+System.currentTimeMillis()+" run ThreadName="+Thread.currentThread().getName());
            System.out.println("--------------------");
            System.out.println("speedPrintString releaseLock time="+System.currentTimeMillis()+" run ThreadName="+Thread.currentThread().getName());
        }
    }
}
