package com.bryce.book.core.theSecondChapter.two_two.synBlockString2;

/**
 * @author huff
 * @date 2020/3/17 17:31
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a= new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b= new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
