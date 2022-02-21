package com.bryce.book.core.theThirdChapter.three_three.InheritableThreadLocal1;

/**
 * @author huff
 * @date 2020/3/20 17:59
 */

/**
 * 使用InheritableThreadLocal类可以让子线程取得从父线程继承下来的值
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("    在Main线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a=new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
