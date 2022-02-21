package com.bryce.book.core.theSecondChapter.two_two.test1;

/**
 * @author huff
 * @date 2020/3/18 0:32
 */
public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1 getLock time=" +System.currentTimeMillis()+" run ThreadName=" +Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time=" +System.currentTimeMillis()+" run ThreadName=" +Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
