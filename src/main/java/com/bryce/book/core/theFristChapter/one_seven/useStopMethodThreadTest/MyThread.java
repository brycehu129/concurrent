package com.bryce.book.core.theFristChapter.one_seven.useStopMethodThreadTest;

/**
 * @author huff
 * @date 2020/3/16 14:11
 */
public class MyThread extends  Thread {
    private int i=0;
    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
