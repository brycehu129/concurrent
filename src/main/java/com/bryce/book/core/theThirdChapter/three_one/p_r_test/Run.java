package com.bryce.book.core.theThirdChapter.three_one.p_r_test;

/**
 * @author huff
 * @date 2020/3/19 21:19
 */

/**
 * 一生产与一消费：操作值
 */
public class Run {
    public static void main(String[] args) {
        String lock=new String("");
        P p=new P(lock);
        C c=new C(lock);
        ThreadP pThread=new ThreadP(p);
        ThreadC cThread=new ThreadC(c);
        pThread.start();
        cThread.start();
    }
}
