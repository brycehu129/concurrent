package com.bryce.book.core.theSecondChapter.two_two.t8;

/**
 * @author huff
 * @date 2020/3/17 16:48
 */

/**
 * 验证同步synchronized(this)代码块是锁定当前对象的
 */
public class Task {
    /*synchronized*/ public void otherMethod(){
        System.out.println("--------------------------------run--otherMethod");
    }

    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
