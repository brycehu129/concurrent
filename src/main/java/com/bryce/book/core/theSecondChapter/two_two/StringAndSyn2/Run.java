package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn2;

/**
 * @author huff
 * @date 2020/3/18 1:48
 */

/**
 * 交替打印是因为持有的锁不是同一个，因为将String改为了Object（避免了String常量池带来的问题）
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a= new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
