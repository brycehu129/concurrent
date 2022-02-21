package com.bryce.book.core.theSeventhChapter.seven_seven.threadExceptionMore;

/**
 * @author huff
 * @date 2020/3/27 1:11
 *
 * “线程异常处理的传递”
 */
public class MyThread extends Thread {
    private String num = "a";

    public MyThread() {
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }


    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印："+(numInt+1));
    }
}
