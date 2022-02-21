package com.bryce.book.core.theFristChapter.one_seven.t11;

/**
 * @author huff
 * @date 2019/12/2 22:56
 */

/**
 * 调用interrupt()方法来停止线程
 * 调用interrupt()仅仅是在当前线程中打了一个标记，并不是真的停止线程
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i="+(i+1));
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

    }
}
