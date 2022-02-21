package com.bryce.book.core.theSecondChapter.two_three.volatileTestThread;

/**
 * @author huff
 * @date 2020/3/18 17:50
 */

/**
 * 关键字volatile虽然增加了实例变量在多个线程之间的可见性，但它却不具备同步性，那么也就不具备原子性
 */
public class MyThread extends Thread{
    volatile public static int count;
    //主要一定要添加static关键字
    //这样synchronized与static锁的内容就是MyThread.class类了
    //也就达到同步的效果了
    /*synchronized*/ private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
