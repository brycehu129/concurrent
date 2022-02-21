package com.bryce.book.core.theThirdChapter.three_one.stack_1;

/**
 * @author huff
 * @date 2020/3/20 15:18
 */

/**
 * 一生产与一消费:操作栈
 * 实验使生产者向堆栈List对象中放入数据，使消费者从List堆栈中取出数据，List的最大容量为1
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        C_Thread cThread = new C_Thread(c);
        pThread.start();
        cThread.start();
    }
}
