package com.bryce.book.core.theSecondChapter.two_three.t99;

/**
 * @author huff
 * @date 2020/3/18 17:12
 */

/**
 * 关键字volatile的主要作用是使变量在多个线程内可见
 */
public class PrintString {
    private boolean isContinuePrint=true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod(){
        try {
            while (isContinuePrint==true){
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
