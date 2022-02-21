package com.bryce.book.core.theThirdChapter.three_one.stack_2_new;

/**
 * @author huff
 * @date 2020/3/20 15:18
 */

/**
 * 一生产与多消费----操作栈:解决wait条件改变与假死
 * 没有出现异常，但出现了假死情况，可将notify换为notifyAll，见stack_2_new_final
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        pThread.start();
        C_Thread cThread1 = new C_Thread(c1);
        C_Thread cThread2 = new C_Thread(c2);
        C_Thread cThread3 = new C_Thread(c3);
        C_Thread cThread4 = new C_Thread(c4);
        C_Thread cThread5 = new C_Thread(c5);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
