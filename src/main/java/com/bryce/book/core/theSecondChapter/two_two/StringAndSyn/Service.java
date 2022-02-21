package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn;

/**
 * @author huff
 * @date 2020/3/18 1:37
 */

/**
 * 将synchronized(String)同步块与String联合使用时，要注意常量池带来的一些例外
 */
public class Service {
    public static void print(String stringParam){
        try {
            synchronized (stringParam){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
