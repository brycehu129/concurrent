package com.bryce.book.core.theSecondChapter.two_one.throwExceptionNoLock;

/**
 * @author huff
 * @date 2020/3/17 15:54
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service =new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
