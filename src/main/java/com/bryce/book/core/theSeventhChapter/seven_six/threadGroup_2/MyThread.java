package com.bryce.book.core.theSeventhChapter.seven_six.threadGroup_2;

/**
 * @author huff
 * @date 2020/3/27 1:02
 */
public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (this.isInterrupted()==false){
            System.out.println("死循环中："+Thread.currentThread().getName());
        }
    }
}
