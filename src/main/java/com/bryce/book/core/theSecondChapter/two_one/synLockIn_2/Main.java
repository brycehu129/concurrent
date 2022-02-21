package com.bryce.book.core.theSecondChapter.two_one.synLockIn_2;

/**
 * @author huff
 * @date 2020/3/17 15:41
 */
public class Main {
    public int i=10;

    synchronized public void operateIMainMethod(){
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
