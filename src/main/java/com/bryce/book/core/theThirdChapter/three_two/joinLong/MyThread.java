package com.bryce.book.core.theThirdChapter.three_two.joinLong;

/**
 * @author huff
 * @date 2020/3/20 16:28
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
