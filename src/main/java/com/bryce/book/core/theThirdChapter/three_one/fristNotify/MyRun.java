package com.bryce.book.core.theThirdChapter.three_one.fristNotify;

/**
 * @author huff
 * @date 2020/3/19 17:01
 */

/**
 * 如果通知过早，则会打乱程序正常的运行逻辑
 */
public class MyRun {
    private String lock = new String("");
    private boolean isFristRunB=false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (isFristRunB==false){
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFristRunB=true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run=new MyRun();
        Thread a=new Thread(run.runnableA);
        a.start();

        Thread.sleep(100);
        Thread b=new Thread(run.runnableB);
        b.start();
    }
}
