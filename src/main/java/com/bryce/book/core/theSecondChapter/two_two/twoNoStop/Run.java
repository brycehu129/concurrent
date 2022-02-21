package com.bryce.book.core.theSecondChapter.two_two.twoNoStop;


/**
 * @author huff
 * @date 2020/3/18 15:47
 */

/**
 * 此处锁住的不是同一个对象，故可以交叉运行
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
