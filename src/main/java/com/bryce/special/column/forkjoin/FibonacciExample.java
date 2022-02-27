package com.bryce.special.column.forkjoin;

import com.bryce.book.core.theFourthChapter.four_one.condition123.F;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/27 15:48
 * @description 斐波那契数列
 */
public class FibonacciExample extends RecursiveTask<Integer> {

    final int n;

    FibonacciExample(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1){
            return n;
        }
        FibonacciExample f1 = new FibonacciExample(n - 1);
        //创建子任务
        f1.fork();
        FibonacciExample f2 = new FibonacciExample(n - 2);
        //等待子任务结果，并合并结果
        return f2.compute() + f1.join();
    }

    public static void main(String[] args) {
        //创建分治任务线程池
        ForkJoinPool fjp = new ForkJoinPool(4);
        //创建分治任务
        FibonacciExample example = new FibonacciExample(30);
        //启动分治任务
        Integer result = fjp.invoke(example);
        System.out.println(result);
    }
}
