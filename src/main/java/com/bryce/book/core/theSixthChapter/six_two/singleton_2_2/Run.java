package com.bryce.book.core.theSixthChapter.six_two.singleton_2_2;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */

/**
 * 加入同步synchronized语句块得到相同实例的对象，运行效率依然非常低下，它同样是同步运行的
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        //此版本代码虽然是正确的
        //但public static MyObject getInstance()方法
        //中的全部代码都是同步的了，这样做也会降低运行效率
    }
}
