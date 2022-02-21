package com.bryce.book.core.theSecondChapter.two_two.synStaticMethod;

/**
 * @author huff
 * @date 2020/3/18 1:02
 */

/**
 * 从运行结果看，加不加static是一样的效果，都是同步；
 * 但synchronized关键字加到static静态方法上是给Class类加锁，而synchronized关键字加到非static方法上是给对象加锁（详情见synTwoLock）
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB();
        b.setName("B");
        b.start();
    }
}
