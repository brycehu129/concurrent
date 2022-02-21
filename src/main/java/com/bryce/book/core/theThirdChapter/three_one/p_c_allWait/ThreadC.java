package com.bryce.book.core.theThirdChapter.three_one.p_c_allWait;

/**
 * @author huff
 * @date 2020/3/19 21:18
 */

//消费者线程
public class ThreadC extends Thread{
    private C c;

    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.getValue();
        }
    }
}
