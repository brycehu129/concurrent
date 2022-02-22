package com.bryce.special.column.threadPool;

import java.util.concurrent.*;

/**
 * @author hufei
 * @date 2022/2/22 20:29
 * @description
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,
                10,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100),
                new UserThreadFactory("handle"),
                new CustomRejectedStrategy());
        for (int i = 0; i < 1000000; i++) {
            int finalI = i;
            poolExecutor.execute(()->{
                System.out.println(Thread.currentThread().getName()+"执行中------"+ finalI +"--------");
            });
        }
    }

}
