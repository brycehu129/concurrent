package com.bryce.book.core.theSeventhChapter.seven_two.groupAddThread;

/**
 * @author huff
 * @date 2020/3/26 17:06
 *
 * 线程组的作用：可以批量的管理线程或线程组对象，有效的对线程或线程组对象进行组织
 *
 * 线程对象关联线程组：1级关联
 *
 * 1级关联即是父对象中有子对象，但并不创建子孙对象
 */
public class Run {
    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();
        ThreadGroup group = new ThreadGroup("Huff的线程组");
        Thread aThread = new Thread(group,aRunnable);
        Thread bThread = new Thread(group,bRunnable);
        aThread.start();
        bThread.start();
        System.out.println("活动的线程数为："+group.activeCount());
        System.out.println("线程组的名称为："+group.getName());
    }
}
