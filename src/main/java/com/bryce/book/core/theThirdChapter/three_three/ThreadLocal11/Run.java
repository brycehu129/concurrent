package com.bryce.book.core.theThirdChapter.three_three.ThreadLocal11;

/**
 * @author huff
 * @date 2020/3/20 17:34
 */

/**
 * 类ThreadLocal主要解决的是每个线程绑定自己的值，可以将ThreadLocal类比喻成全局存放数据的盒子，盒子中可以存储每个线程的私有数据
 *
 * 方法get()与null
 */
public class Run {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get()==null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
