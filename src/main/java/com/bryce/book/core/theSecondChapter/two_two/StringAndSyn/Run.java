package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn;

/**
 * @author huff
 * @date 2020/3/18 1:40
 */

/**
 * 出现此种结果的原因是String的两个值都是AA，两个线程持有相同的锁，所以线程B不能执行;
 * 因此在大多数情况下，同步synchronized代码块都不使用String作为锁对象，而改用其他，比如new Object()实例化一个Object对象
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a= new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
