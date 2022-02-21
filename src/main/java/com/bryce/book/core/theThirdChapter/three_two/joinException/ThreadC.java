package com.bryce.book.core.theThirdChapter.three_two.joinException;

/**
 * @author huff
 * @date 2020/3/20 16:24
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
