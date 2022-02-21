package com.bryce.book.core.theFristChapter.one_seven.t12;

/**
 * @author huff
 * @date 2019/12/2 23:05
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
            Thread.sleep(1000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println("是否停止1? ="+thread.interrupted());  //当前线程为main，从未中断
            System.out.println("是否停止2? ="+thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");

    }
}
