package com.bryce.book.core.theFristChapter.one_eight.suspend_resume_test;

/**
 * @author huff
 * @date 2020/3/16 14:40
 */

/**
 * 可以使用suspend()暂停线程，使用resume()恢复线程的执行
 */
public class MyThread extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}
