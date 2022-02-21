package com.bryce.book.core.theFourthChapter.four_one.awaitUnitTest;

/**
 * @author huff
 * @date 2020/3/24 18:17
 */

/**
 * 线程在等待时间到达前，可以被其他线程提前唤醒
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
