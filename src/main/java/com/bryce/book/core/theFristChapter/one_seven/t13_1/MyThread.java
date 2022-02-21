package com.bryce.book.core.theFristChapter.one_seven.t13_1;

/**
 * @author huff
 * @date 2020/3/16 13:43
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()){
                    System.out.println("已经是停止状态了 ！ 我要退出了 ！");
                    throw  new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("我在 for 下面");
        }catch (InterruptedException e){
            System.out.println("进MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
