package com.bryce.book.core.theThirdChapter.three_one.TwoThreadTransData;

/**
 * @author huff
 * @date 2020/3/18 20:07
 */

/**
 * 虽然两个线程实现了通信，但while循环不断来监测某一条件，会浪费CPU资源
 * 倘若轮询的时间间隔很小，更浪费CPU资源，如果轮询的时间间隔很大，有可能会取不到想要的数据
 * 此时便需要一种机制来实现减少CPU的资源浪费，而且还可以实现在多个线程间通信，它就是“wait/notify”机制
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true){
                if (list.size()==5){
                    System.out.println("==5了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
