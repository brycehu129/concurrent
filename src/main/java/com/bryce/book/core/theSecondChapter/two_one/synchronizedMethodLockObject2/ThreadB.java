package com.bryce.book.core.theSecondChapter.two_one.synchronizedMethodLockObject2;

/**
 * @author huff
 * @date 2020/3/17 14:42
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
