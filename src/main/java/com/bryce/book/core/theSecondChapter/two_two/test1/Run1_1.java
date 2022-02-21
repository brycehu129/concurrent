package com.bryce.book.core.theSecondChapter.two_two.test1;

/**
 * @author huff
 * @date 2020/3/18 0:37
 */


/**
 * 验证：当多个线程同时执行synchronized(x){}同步代码块时呈同步效果；
 * 因为使用了同一个“对象监视器”，即类Service中的synchronized (object)中的object
 */
public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("b");
        b.start();
    }
}
