package com.bryce.book.core.theSeventhChapter.seven_six.threadGroup_2;

/**
 * @author huff
 * @date 2020/3/27 1:01
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
