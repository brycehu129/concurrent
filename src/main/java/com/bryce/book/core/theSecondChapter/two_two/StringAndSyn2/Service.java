package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn2;

/**
 * @author huff
 * @date 2020/3/18 1:46
 */
public class Service {
    public static void print(Object object){
        try {
            synchronized (object){
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
