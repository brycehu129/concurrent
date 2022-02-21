package com.bryce.book.core.theThirdChapter.three_two.joinTest1;

/**
 * @author huff
 * @date 2020/3/20 16:10
 */

/**
 * 通常情况下，主线程创建并启动子线程，倘若子线程需要进行大量的耗时运算，主线程往往早于子线程结束之前结束；
 * 若主线程想等待子线程结束之后再结束，需要用到join方法。
 *
 * join();等待线程对象销毁
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
