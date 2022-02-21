package com.bryce.book.core.theSecondChapter.two_three.t16;

/**
 * @author huff
 * @date 2020/3/18 17:24
 */
public class RunThread extends Thread{
    /*volatile*/ private boolean isRunning=true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning==true){

        }
        System.out.println("线程被停止了！");
    }
}
