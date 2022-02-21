package com.bryce.book.core.theThirdChapter.three_three.s5;

/**
 * @author huff
 * @date 2020/3/20 17:45
 */

/**
 * 验证数据的隔离性
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
