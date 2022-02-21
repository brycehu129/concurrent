package com.bryce.book.core.theSeventhChapter.seven_two.groupAddThread;

/**
 * @author huff
 * @date 2020/3/26 22:31
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName="+Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
