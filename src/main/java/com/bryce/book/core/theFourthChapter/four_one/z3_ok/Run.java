package com.bryce.book.core.theFourthChapter.four_one.z3_ok;

/**
 * @author huff
 * @date 2020/3/24 14:27
 */


/**
 * 只打印"A"，原因是调用了Condition对象的await()方法，使当前执行任务的线程进入了等待WARNING状态
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a=new MyThreadA(myService);
        a.start();
    }
}
