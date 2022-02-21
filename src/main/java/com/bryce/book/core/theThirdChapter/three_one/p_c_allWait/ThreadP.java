package com.bryce.book.core.theThirdChapter.three_one.p_c_allWait;

/**
 * @author huff
 * @date 2020/3/19 21:17
 */

//生产者线程
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
