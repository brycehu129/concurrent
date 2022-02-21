package com.bryce.special.column.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 18:53
 * @description 累加器
 */
public class AddDemo {

    static int count;

    static final Semaphore s = new Semaphore(1);
    //用信号量保证互斥
    static void addOne() throws InterruptedException {
        s.acquire();
        try {
            count+=1;
        }finally {
            s.release();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    AddDemo.addOne();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(5);
        System.out.println(count);
    }

}
