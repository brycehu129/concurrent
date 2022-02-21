package com.bryce.book.core.theSecondChapter.two_two.t9;

/**
 * @author huff
 * @date 2020/3/18 0:20
 */
public class MyThread1 extends Thread {
    private MyOneList list;

    public MyThread1(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"A");
    }
}
