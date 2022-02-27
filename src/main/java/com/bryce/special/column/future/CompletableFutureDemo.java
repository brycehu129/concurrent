package com.bryce.special.column.future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/27 15:15
 * @description CompletableFuture example
 */
public class CompletableFutureDemo {


    public static void main(String[] args) {
        //描述串行关系 thenApply()
        CompletableFuture<String> f0 = CompletableFuture.supplyAsync(()->"Hello World")
                .thenApply(s->s+" QQ")
                .thenApply(String::toUpperCase);
        System.out.println(f0.join());

        //AND 汇聚关系  thenCombine、thenAcceptBoth、runAfterBoth


        //OR 汇聚关系 applyToEither、acceptEither 和 runAfterEither
        CompletableFuture<String> f1 =
                CompletableFuture.supplyAsync(()->{
                    int t = new Random().nextInt(10);
                    System.out.println("f1:"+t);
                    try {
                        TimeUnit.SECONDS.sleep(t);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return String.valueOf(t);
                });

        CompletableFuture<String> f2 =
                CompletableFuture.supplyAsync(()->{
                    int t = new Random().nextInt(10);
                    System.out.println("f2:"+t);
                    try {
                        TimeUnit.SECONDS.sleep(t);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return String.valueOf(t);
                });

        CompletableFuture<String> f3 =
                f1.applyToEither(f2,s -> s);

        System.out.println(f3.join());

        //异常处理
    }


}
