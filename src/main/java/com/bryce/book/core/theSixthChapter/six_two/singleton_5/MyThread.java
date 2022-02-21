package com.bryce.book.core.theSixthChapter.six_two.singleton_5;

/**
 * @author huff
 * @date 2020/3/24 21:27
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
