package com.bryce.question;

import com.bryce.book.core.theFourthChapter.four_one.condition123.F;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hufei
 * @date 2022/3/1 14:01
 * @description
 */
class Foo {

    private AtomicInteger value = new AtomicInteger(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        while (value.intValue() != 0) {

        }
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (value.intValue() != 1) {

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        value.getAndIncrement();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (value.intValue() != 2) {

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
