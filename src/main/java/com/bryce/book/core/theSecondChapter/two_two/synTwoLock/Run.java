package com.bryce.book.core.theSecondChapter.two_two.synTwoLock;

/**
 * @author huff
 * @date 2020/3/18 1:13
 */

/**
 * 验证了synchronized关键字加到static静态方法和非static方法上的锁不是同一个锁;
 * 异步的原因是持有不同的锁，一个是对象锁，另外一个是class锁，而class锁可以对类的所有对象实例起作用（见synMoreObjectStaticOneLock）
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a= new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b= new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c= new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
