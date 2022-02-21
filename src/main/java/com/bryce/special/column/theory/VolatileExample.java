package com.bryce.special.column.theory;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/7 21:04
 * @description todo
 */
public class VolatileExample {
    int x = 0;
    //volatile boolean v = false;
    boolean v = false;    //若去掉volatile，x是多少呢？
    public void writer() {
        x = 42;
        v = true;
    }

    public void reader() {
        if (v == true) {
            // 这里x会是多少呢？
            System.out.println(x);
        }
    }

    public static void get() throws InterruptedException {
        VolatileExample example = new VolatileExample();
        Thread a = new Thread(() -> {
            example.writer();
        }, "A");
        a.start();
        a.join();
        Thread b = new Thread(() -> {
            example.reader();
        }, "B");
        b.start();
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000000; i++) {
            VolatileExample.get();
        }
    }
}
