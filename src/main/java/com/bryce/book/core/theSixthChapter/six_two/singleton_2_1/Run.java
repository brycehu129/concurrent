package com.bryce.book.core.theSixthChapter.six_two.singleton_2_1;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */

/**
 * 加入同步synchronized关键字得到相同实例的对象，运行效率非常低下
 * 因为它是同步运行的，下一个线程想要取得对象，则必须等上一个线程释放锁之后，才可以继续执行
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
