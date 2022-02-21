package com.bryce.book.core.theThirdChapter.three_two.join_sleep_2;

/**
 * @author huff
 * @date 2020/3/20 16:35
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                b.start();
                b.join();  //说明join释放锁了
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
