package com.bryce.book.core.theFourthChapter.four_one.ConditionTestManyToMany;

/**
 * @author huff
 * @date 2020/3/24 15:47
 */

/**
 * 程序运行后出现“假死”情况
 *
 * 将signal()换成signalAll()即可解决
 * 换了后，“打印☆”和“打印★”交替出现，但“有可能★★连接”与“有可能☆☆连接”却不是交替出现
 * 因为程序中使用了同一个Condition对象，再使用signalAll()方法唤醒所有线程，有可能唤醒的是同类
 */
public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        MyThreadA[] a = new MyThreadA[10];
        MyThreadB[] b = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new MyThreadA(service);
            b[i] = new MyThreadB(service);
            a[i].start();
            b[i].start();
        }
    }
}
