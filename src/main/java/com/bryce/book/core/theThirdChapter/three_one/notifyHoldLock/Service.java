package com.bryce.book.core.theThirdChapter.three_one.notifyHoldLock;

/**
 * @author huff
 * @date 2020/3/19 16:29
 */


/**
 * 验证：方法notify()被执行后，不释放锁
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait() ThreadName="+Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin notify() ThreadName="+Thread.currentThread().getName());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify() ThreadName="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
