package com.bryce.book.core.theThirdChapter.three_one.stack_2_new_final;

/**
 * @author huff
 * @date 2020/3/19 22:05
 */
public class P_Thread extends Thread {
    private P p;

    public P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.pushService();
        }
    }
}
