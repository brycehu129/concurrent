package com.bryce.book.core.theThirdChapter.three_two.join_sleep_2;

/**
 * @author huff
 * @date 2020/3/20 16:39
 */

/**
 * 证明了join(long)方法释放锁的特点
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b=new ThreadB();
            ThreadA a=new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c=new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
