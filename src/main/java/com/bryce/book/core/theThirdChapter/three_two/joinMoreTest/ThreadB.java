package com.bryce.book.core.theThirdChapter.three_two.joinMoreTest;

/**
 * @author huff
 * @date 2020/3/20 16:50
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("   begin B threadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   end   B threadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
