package com.bryce.book.core.theSeventhChapter.seven_five.threadCreateException;

/**
 * @author huff
 * @date 2020/3/27 0:43
 *
 * 线程中出现异常的处理
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
