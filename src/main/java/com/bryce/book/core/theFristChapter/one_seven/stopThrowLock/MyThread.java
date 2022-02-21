package com.bryce.book.core.theFristChapter.one_seven.stopThrowLock;

/**
 * @author huff
 * @date 2020/3/16 14:27
 */
public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }
}
