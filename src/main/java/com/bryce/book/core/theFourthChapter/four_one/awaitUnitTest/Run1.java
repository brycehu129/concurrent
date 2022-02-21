package com.bryce.book.core.theFourthChapter.four_one.awaitUnitTest;

/**
 * @author huff
 * @date 2020/3/24 18:15
 */
public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA a=new MyThreadA(service);
        a.start();
    }
}
