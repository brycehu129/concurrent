package com.bryce.book.core.theSecondChapter.two_two.test3;

import com.bryce.book.core.theSecondChapter.two_two.test2.MyObject;

/**
 * @author huff
 * @date 2020/3/18 0:47
 */
public class ThreadB extends  Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
