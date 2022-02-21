package com.bryce.book.core.theFristChapter.one_eight.suspend_resume_nosameValue;

/**
 * @author huff
 * @date 2020/3/16 15:10
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject=new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                myObject.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
