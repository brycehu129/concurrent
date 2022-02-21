package com.bryce.book.core.theSecondChapter.two_two.synStaticMethod;

/**
 * @author huff
 * @date 2020/3/18 1:01
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
