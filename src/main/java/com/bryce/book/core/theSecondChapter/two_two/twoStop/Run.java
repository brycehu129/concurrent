package com.bryce.book.core.theSecondChapter.two_two.twoStop;

/**
 * @author huff
 * @date 2020/3/18 15:47
 */

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA athread = new ThreadA(service);
        athread.start();
        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }
}
