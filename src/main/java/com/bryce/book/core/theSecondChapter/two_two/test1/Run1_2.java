package com.bryce.book.core.theSecondChapter.two_two.test1;

/**
 * @author huff
 * @date 2020/3/18 0:41
 */

/**
 * 这里对象监视器是不同的两个对象，故呈现异步效果
 */

public class Run1_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service,object1);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object2);
        b.setName("b");
        b.start();
    }
}
