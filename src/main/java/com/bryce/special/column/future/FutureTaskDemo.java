package com.bryce.special.column.future;

import java.util.concurrent.*;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/27 15:01
 * @description FutureTask example
 */
public class FutureTaskDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //将 FutureTask 对象提交给 ThreadPoolExecutor 去执行
        FutureTask<Integer> futureTask = new FutureTask<>(()->1+2);
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(futureTask);
        Integer result = futureTask.get();
        System.out.println(result);
    }


}
