package com.bryce.book.core.theFristChapter.one_eleven.daemonThread;

/**
 * @author huff
 * @date 2020/3/16 15:55
 */
public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
