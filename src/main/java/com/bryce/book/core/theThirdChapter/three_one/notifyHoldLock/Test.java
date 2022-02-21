package com.bryce.book.core.theThirdChapter.three_one.notifyHoldLock;

/**
 * @author huff
 * @date 2020/3/19 16:34
 */

/**
 * 结论：必须执行完notify()方法所在的同步synchronized代码块后才释放锁
 */
public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        NotifyThread notifyThread=new NotifyThread(lock);
        notifyThread.start();
        SynNotifyMethodThread c=new SynNotifyMethodThread(lock);
        c.start();
    }
}
