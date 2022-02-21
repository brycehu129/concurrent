package com.bryce.book.core.theSecondChapter.two_two.twoStop;

/**
 * @author huff
 * @date 2020/3/18 15:44
 */

/**
 * 同步方法容易造成死循环，bthread无法运行；
 * 可使用同步块来解决，见twoNoStop
 */
public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        while (isContinueRun){

        }
        System.out.println("methodA end");
    }

    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
