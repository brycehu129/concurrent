package com.bryce.book.core.theSecondChapter.two_one.synNotExtends;

/**
 * @author huff
 * @date 2020/3/17 16:02
 */
public class MyThreadB extends Thread {
    private Sub sub;

    public MyThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
