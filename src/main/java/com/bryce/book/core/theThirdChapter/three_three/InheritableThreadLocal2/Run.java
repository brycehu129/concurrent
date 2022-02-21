package com.bryce.book.core.theThirdChapter.three_three.InheritableThreadLocal2;

/**
 * @author huff
 * @date 2020/3/20 17:59
 */

/**
 * 使用InheritableThreadLocal类可以让子线程取得从父线程继承下来的值
 * 并且在继承的同时对值作进一步的修改,见InheritableThreadLocalExt类重写的childValue方法
 *
 * 注意：如果子线程在取得值的同时，主线程将InheritableThreadLocal中的值进行修改，那么子线程取到的值还是旧值
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("    在Main线程中取值="+ Tools.t1.get());
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
