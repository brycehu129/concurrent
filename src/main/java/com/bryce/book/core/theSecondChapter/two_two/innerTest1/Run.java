package com.bryce.book.core.theSecondChapter.two_two.innerTest1;

/**
 * @author huff
 * @date 2020/3/18 16:35
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner=new OutClass.Inner();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }

}
