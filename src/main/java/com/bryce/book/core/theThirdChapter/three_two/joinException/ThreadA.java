package com.bryce.book.core.theThirdChapter.three_two.joinException;

/**
 * @author huff
 * @date 2020/3/20 16:22
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
