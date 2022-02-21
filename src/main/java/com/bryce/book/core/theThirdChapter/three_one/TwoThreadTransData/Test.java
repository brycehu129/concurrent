package com.bryce.book.core.theThirdChapter.three_one.TwoThreadTransData;

/**
 * @author huff
 * @date 2020/3/18 20:10
 */
public class Test {
    public static void main(String[] args) {
        MyList service=new MyList();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
