package com.bryce.book.core.theSecondChapter.two_one.t3;

/**
 * @author huff
 * @date 2020/3/17 14:54
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
