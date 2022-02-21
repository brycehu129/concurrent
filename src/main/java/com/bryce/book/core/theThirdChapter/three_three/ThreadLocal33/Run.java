package com.bryce.book.core.theThirdChapter.three_three.ThreadLocal33;

/**
 * @author huff
 * @date 2020/3/20 17:53
 */

/**
 * 再次验证线程变量的隔离性
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("   在main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
