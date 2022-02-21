package com.bryce.book.core.theSecondChapter.two_two.setNewStringTwoLock;

/**
 * @author huff
 * @date 2020/3/18 17:00
 */

/**
 * 此时线程A和B争抢的锁都是"123"
 */
public class Run2 {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");;
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
