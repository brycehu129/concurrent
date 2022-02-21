package com.bryce.book.core.theFristChapter.one_eight.suspend_resume_LockStop;

/**
 * @author huff
 * @date 2020/3/16 14:57
 */

/**
 * 查看println()方法的内部实现，可知线程执行到println()内部停止时，同步锁没有被释放，故main方法中的println不能够打印"main end!"
 */
public class MyThread extends Thread {
    private long i=0;

    @Override
    public void run() {
        while (true){
            i++;
            //System.out.println(i);
        }
    }
}
