package com.bryce.special.column.semaphore;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 19:12
 * @description 对象池
 */
public class ObjPool<T, R> {

    final List<T> pool;
    // 用信号量实现限流器
    final Semaphore sem;

    public ObjPool(int size, T t) {
        //信号量支持多个线程进入，可能会导致线程安全问题
        //而Vector是线程安全的
        pool = new Vector<>();
        for (int i = 0; i < size; i++) {
            pool.add(t);
        }
        sem = new Semaphore(size);
    }

    // 利用对象池的对象，调用func
    R exec(Function<T, R> func) throws InterruptedException {
        T t = null;
        sem.acquire();
        try {
            t = pool.remove(0);
            return func.apply(t);
        } finally {
            pool.add(t);
            sem.release();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //创建对象池,这样同时最多有10个对象可供诸多线程使用
        ObjPool<Long, Long> pool = new ObjPool<Long, Long>(10, 2L);
        pool.exec(t -> {
            System.out.println(t);
            return t;
        });
    }

}
