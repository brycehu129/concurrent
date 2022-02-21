package com.bryce.book.core.theThirdChapter.three_one.waitOld;

/**
 * @author huff
 * @date 2020/3/19 20:56
 */
public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.substract();
    }
}
