package com.bryce.special.column.threadPool;

import java.util.Random;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hufei
 * @date 2022/2/22 20:45
 * @description 自定义拒绝策略
 */
public class CustomRejectedStrategy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        try {
            final Thread t = new Thread(r, "Temporary task executor"+ new Random().nextInt(100000));
            t.start();
        } catch (Throwable e) {
            throw new RejectedExecutionException(
                    "Failed to start a new thread", e);
        }
    }

}
