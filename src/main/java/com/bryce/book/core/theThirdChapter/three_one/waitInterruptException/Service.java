package com.bryce.book.core.theThirdChapter.three_one.waitInterruptException;

/**
 * @author huff
 * @date 2020/3/19 16:38
 */

/**
 * 当线程呈wait状态时，调用线程对象的interrupt()方法会出现InterruptedException异常
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }
}
