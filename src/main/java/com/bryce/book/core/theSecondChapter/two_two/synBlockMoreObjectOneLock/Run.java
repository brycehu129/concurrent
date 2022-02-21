package com.bryce.book.core.theSecondChapter.two_two.synBlockMoreObjectOneLock;

/**
 * @author huff
 * @date 2020/3/18 1:32
 */
public class Run {
    public static void main(String[] args) {
        Service service1=new Service();
        Service service2=new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }
}
