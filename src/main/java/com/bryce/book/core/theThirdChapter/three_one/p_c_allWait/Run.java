package com.bryce.book.core.theThirdChapter.three_one.p_c_allWait;

/**
 * @author huff
 * @date 2020/3/19 21:43
 */

/**
 * 多生产与多消费：操作值-假死
 * “假死”状态
 * 原因：wait/notify机制可能唤醒的是异类，比如“生产者”唤醒生产者，积少成多下去，所有的线程都呈WAITING状态
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock=new String("");
        P p=new P(lock);
        C c=new C(lock);
        ThreadP[] pThread=new ThreadP[2];
        ThreadC[] cThread=new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            pThread[i]=new ThreadP(p);
            pThread[i].setName("生产者 "+(i+1));
            cThread[i]=new ThreadC(c);
            cThread[i].setName("消费者 "+(i+1));
            pThread[i].start();
            cThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
        }
    }
}
