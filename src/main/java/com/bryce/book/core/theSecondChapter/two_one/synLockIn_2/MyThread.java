package com.bryce.book.core.theSecondChapter.two_one.synLockIn_2;

/**
 * @author huff
 * @date 2020/3/17 15:45
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operateISubMethod();
    }
}
