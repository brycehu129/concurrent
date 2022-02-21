package com.bryce.book.core.theFourthChapter.four_one.MustUseMoreCondition_Error;

/**
 * @author huff
 * @date 2020/3/24 15:07
 */

/**
 *使用signalAll()方法，A、B线程都被唤醒；
 *
 *唤醒部分线程可使用多个Condition对象，即Condition对象可以唤醒部分指定线程，有助于提升程序运行的效率
 * 可以先对线程进行分组，然后再唤醒指定组中的线程，见MustUseMoreCondition_OK
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
        service.signalAll();
    }
}
