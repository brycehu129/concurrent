package com.bryce.book.core.theSixthChapter.six_two.singleton_3;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */

/**
 * 只对实例化对象的关键代码进行同步，从语句结构上来看，运行效率的确得到了提升
 * 但在多线程条件下无法解决得到同一个实例对象的结果
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
