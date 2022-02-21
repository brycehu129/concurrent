package com.bryce.book.core.theSecondChapter.two_one.t1;

/**
 * @author huff
 * @date 2020/3/16 16:58
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef=new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef);
        athread.start();
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }
}
