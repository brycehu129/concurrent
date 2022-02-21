package com.bryce.book.core.theThirdChapter.three_two.joinException;

/**
 * @author huff
 * @date 2020/3/20 16:21
 */

/**
 * 在join过程中，如果当前线程对象被中断，则当前线程出现异常
 *
 * 结果显示：join()与interrupt()彼此遇到，则会出现异常
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b=new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c=new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
