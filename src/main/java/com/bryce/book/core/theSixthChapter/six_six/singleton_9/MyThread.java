package com.bryce.book.core.theSixthChapter.six_six.singleton_9;

/**
 * @author huff
 * @date 2020/3/25 15:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}
