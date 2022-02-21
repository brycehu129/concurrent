package com.bryce.book.core.theSecondChapter.two_two.synMoreObjectStaticOneLock;

/**
 * @author huff
 * @date 2020/3/18 1:24
 */

/**
 * 虽然是不同对象，但静态的同步方法还是同步进行，故可证明class锁可以对类的所有对象实例起作用
 */
public class Run {
    public static void main(String[] args) {
        Service service1=new Service();
        Service service2=new Service();
        ThreadA a= new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b= new ThreadB(service2);
        b.setName("B");
        b.start();

    }
}
