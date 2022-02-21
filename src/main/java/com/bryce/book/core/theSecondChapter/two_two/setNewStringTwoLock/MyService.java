package com.bryce.book.core.theSecondChapter.two_two.setNewStringTwoLock;

/**
 * @author huff
 * @date 2020/3/18 16:53
 */

/**
 * 在将任何数据类型作为同步锁时，需要注意的是，是否有多个线程同时持有锁对象；
 * 如果同时持有相同的锁对象，则这些线程之间就是同步的；
 * 如果分别获得锁对象，这些线程之间就是异步的
 */
public class MyService {
    private String lock="123";

    public void testMethod(){
        try {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                lock="456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
