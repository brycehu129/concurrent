package com.bryce.book.core.theThirdChapter.three_two.join_sleep_2;

/**
 * @author huff
 * @date 2020/3/20 16:35
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("   b run begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   b run   end time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService(){
        System.out.println("打印了bService time="+System.currentTimeMillis());
    }
}
