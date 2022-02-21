package com.bryce.book.core.theSecondChapter.two_two.twoNoStop;

/**
 * @author huff
 * @date 2020/3/18 15:51
 */
public class Service {
    Object object1 = new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }
    }

    Object object2=new Object();
    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
