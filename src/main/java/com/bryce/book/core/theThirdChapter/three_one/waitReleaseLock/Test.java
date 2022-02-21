package com.bryce.book.core.theThirdChapter.three_one.waitReleaseLock;

/**
 * @author huff
 * @date 2020/3/19 16:25
 */
public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        ThreadB b=new ThreadB(lock);
        b.start();
    }
}
