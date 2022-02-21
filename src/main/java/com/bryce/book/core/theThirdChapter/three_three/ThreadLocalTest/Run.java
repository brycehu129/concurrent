package com.bryce.book.core.theThirdChapter.three_three.ThreadLocalTest;

/**
 * @author huff
 * @date 2020/3/20 17:37
 */

/**
 * 类ThreadLocal解决的是变量在不同线程间的隔离性，也就是不同线程拥有自己的值
 * 不同线程中的值是可以放入ThreadLocal类中进行保存的
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a=new ThreadA();
            ThreadB b=new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main"+(i+1));
                System.out.println("Main get value="+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
