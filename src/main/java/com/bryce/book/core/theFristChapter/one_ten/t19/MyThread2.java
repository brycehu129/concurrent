package com.bryce.book.core.theFristChapter.one_ten.t19;

import java.util.Random;

/**
 * @author huff
 * @date 2020/3/16 15:35
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult+i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("☆  ☆  ☆  ☆  ☆ thread 2 use time="+(endTime-beginTime));
    }
}
