package com.bryce.book.core.theSixthChapter.six_two.singleton_1;

/**
 * @author huff
 * @date 2020/3/24 21:23
 */

/**
 * 此实验虽然取得一个对象的实例，但在多线程环境中，就会出现取出多个实例的情况
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
