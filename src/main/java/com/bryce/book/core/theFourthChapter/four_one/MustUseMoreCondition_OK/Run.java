package com.bryce.book.core.theFourthChapter.four_one.MustUseMoreCondition_OK;

/**
 * @author huff
 * @date 2020/3/24 15:37
 */


/**
 * 只有线程A被唤醒，可得知使用ReentrantLock对象可以唤醒指定种类的线程
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}
