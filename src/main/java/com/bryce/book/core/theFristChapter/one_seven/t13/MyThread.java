package com.bryce.book.core.theFristChapter.one_seven.t13;

/**
 * @author huff
 * @date 2019/12/2 23:18
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()){
                System.out.println("已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i="+(i+1));
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end !");
    }
}
