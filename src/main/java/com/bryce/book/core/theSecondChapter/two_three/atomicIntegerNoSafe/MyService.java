package com.bryce.book.core.theSecondChapter.two_three.atomicIntegerNoSafe;

/**
 * @author huff
 * @date 2020/3/18 18:08
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类在具有有逻辑性的情况下输出结果也具有随机性
 */
public class MyService {
    public static AtomicInteger aiRef=new AtomicInteger();

    /*synchronized*/ public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
