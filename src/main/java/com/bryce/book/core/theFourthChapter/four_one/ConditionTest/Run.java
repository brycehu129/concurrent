package com.bryce.book.core.theFourthChapter.four_one.ConditionTest;

/**
 * @author huff
 * @date 2020/3/24 15:47
 */
public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
