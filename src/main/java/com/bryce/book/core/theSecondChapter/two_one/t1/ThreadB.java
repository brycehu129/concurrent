package com.bryce.book.core.theSecondChapter.two_one.t1;

/**
 * @author huff
 * @date 2020/3/16 16:56
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
