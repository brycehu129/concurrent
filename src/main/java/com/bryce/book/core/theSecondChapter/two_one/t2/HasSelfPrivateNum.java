package com.bryce.book.core.theSecondChapter.two_one.t2;

/**
 * @author huff
 * @date 2020/3/16 22:42
 */

/**
 * 两个线程同时访问一个没有同步的方法，且同时操作了业务对象中的实例变量，则会出现"非线程安全问题"；
 * 可加synchronized关键字来避免
 */
public class HasSelfPrivateNum {
    private int num = 0;

    /*synchronized*/ public void addI(String username) {
        try {
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
