package com.bryce.book.core.theSecondChapter.two_two.doubleSynBlockOneTwo;

/**
 * @author huff
 * @date 2020/3/17 16:46
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service=new ObjectService();
        ThreadA a=new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
