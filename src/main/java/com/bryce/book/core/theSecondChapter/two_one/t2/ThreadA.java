package com.bryce.book.core.theSecondChapter.two_one.t2;

/**
 * @author huff
 * @date 2020/3/17 14:10
 */
public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
