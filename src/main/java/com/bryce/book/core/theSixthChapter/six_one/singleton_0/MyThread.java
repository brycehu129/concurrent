package com.bryce.book.core.theSixthChapter.six_one.singleton_0;

/**
 * @author huff
 * @date 2020/3/24 21:16
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
