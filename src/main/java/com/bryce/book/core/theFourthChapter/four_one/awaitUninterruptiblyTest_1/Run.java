package com.bryce.book.core.theFourthChapter.four_one.awaitUninterruptiblyTest_1;

/**
 * @author huff
 * @date 2020/3/24 17:46
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service =  new Service();
            MyThread myThread=new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
