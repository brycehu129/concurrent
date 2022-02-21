package com.bryce.book.core.theThirdChapter.three_one.wait_notify_size5;

/**
 * @author huff
 * @date 2020/3/19 16:09
 */

/**
 * end在最后输出，说明notify()方法执行后并不立刻释放锁
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
