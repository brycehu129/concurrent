package com.bryce.book.core.theThirdChapter.three_two.joinTest2;

/**
 * @author huff
 * @date 2020/3/20 16:17
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
