package com.bryce.book.core.theThirdChapter.three_one.waitOld;

/**
 * @author huff
 * @date 2020/3/19 20:56
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
