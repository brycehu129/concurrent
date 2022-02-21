package com.bryce.book.core.theSecondChapter.two_one.synchronizedMethodLockObject;

/**
 * @author huff
 * @date 2020/3/17 14:31
 */
public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
