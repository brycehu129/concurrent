package com.bryce.book.core.theSecondChapter.two_two.t9;

/**
 * @author huff
 * @date 2020/3/18 0:22
 */

/**
 * 出现“脏读”：两个线程以异步的方式返回list参数的size()大小
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list= new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("listSize="+list.getSize());
    }
}
