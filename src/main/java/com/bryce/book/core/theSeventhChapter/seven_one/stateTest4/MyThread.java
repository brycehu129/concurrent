package com.bryce.book.core.theSeventhChapter.seven_one.stateTest4;

/**
 * @author huff
 * @date 2020/3/26 16:49
 *
 * 验证WAITING
 *
 * 状态WAITING是线程执行了Object.wait()方法后所处的状态
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            synchronized (Lock.Lock){
                Lock.Lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
