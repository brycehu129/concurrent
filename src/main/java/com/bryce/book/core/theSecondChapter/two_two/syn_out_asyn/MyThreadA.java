package com.bryce.book.core.theSecondChapter.two_two.syn_out_asyn;

/**
 * @author huff
 * @date 2020/3/18 0:07
 */
public class MyThreadA extends Thread {
    private MyList list;

    public MyThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA"+(i+1));
        }
    }
}
