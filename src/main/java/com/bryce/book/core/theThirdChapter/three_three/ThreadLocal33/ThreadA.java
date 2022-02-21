package com.bryce.book.core.theThirdChapter.three_three.ThreadLocal33;

/**
 * @author huff
 * @date 2020/3/20 17:52
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
