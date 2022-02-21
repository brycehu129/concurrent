package com.bryce.book.core.theSeventhChapter.seven_three.threadRunSyn;

/**
 * @author huff
 * @date 2020/3/26 23:34
 *
 * 使线程具有有序性
 *
 * 正常情况下，线程在运行时多个线程之间执行任务的时机是无序的
 */
public class MyThread extends Thread {
    private Object lock;
    private String showChar;
    private int showNumPosition;
    private int printCount = 0; //统计打印了几个字符
    volatile private static int addNumber = 1;

    public MyThread(Object lock, String showChar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                while (true){
                    if (addNumber % 3 ==showNumPosition){
                        System.out.println("ThreadName="+Thread.currentThread().getName()+" runCount="+addNumber+" "+showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        System.out.println("ThreadName="+Thread.currentThread().getName()+" printCount="+printCount+" addNumber="+addNumber);
                        if (printCount==3){
                            break;
                        }
                    }else {
                        System.out.println("ThreadName="+Thread.currentThread().getName()+"被锁住了------------");
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
