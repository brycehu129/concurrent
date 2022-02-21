package com.bryce.book.core.theFristChapter.one_seven.runMethodUseStopMethod;

/**
 * @author huff
 * @date 2020/3/16 14:16
 */

/**
 * 调用stop()方法时会抛出java.lang.ThreadDeath异常，但在通常情况下，此异常不需要显式地捕捉;
 * 方法stop()已经被作废，因为如果强行让线程停止则有可能使一些清理性的工作得不到完成；
 * 另外一个情况就是对锁定的对象进行了"解锁"，导致数据得不到同步的处理，出现数据不一致的情况（见stopThrowLock）
 */

public class MyThread extends  Thread {
    @Override
    public void run() {
        try {
            this.stop();
        }catch (ThreadDeath e){
            System.out.println("进入了catch()方法！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
