package com.bryce.book.core.theThirdChapter.three_two.joinMoreTest;

/**
 * @author huff
 * @date 2020/3/20 17:28
 */
public class RunFrist {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("  main end="+System.currentTimeMillis());
    }
}
