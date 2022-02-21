package com.bryce.book.core.theFristChapter.one_seven.useReturnInterrupt;

/**
 * @author huff
 * @date 2020/3/16 14:32
 */

/**
 * 将方法interrupt()与return结合使用也能起到停止线程的作用.
 * 建议使用“抛异常”的方法来实现线程的停止，因为在catch块中还可以将异常向上抛，使线程停止的事件得以传播
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }

}
