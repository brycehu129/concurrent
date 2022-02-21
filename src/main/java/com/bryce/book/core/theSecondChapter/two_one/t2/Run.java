package com.bryce.book.core.theSecondChapter.two_one.t2;

/**
 * @author huff
 * @date 2020/3/17 14:12
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef);
        athread.start();
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }
}
