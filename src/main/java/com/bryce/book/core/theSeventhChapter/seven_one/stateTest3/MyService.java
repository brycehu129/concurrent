package com.bryce.book.core.theSeventhChapter.seven_one.stateTest3;

/**
 * @author huff
 * @date 2020/3/26 16:57
 */
public class MyService {
    synchronized static public void serviceMethod(){
        try {
            System.out.println(Thread.currentThread().getName()+"进入了业务方法！");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
