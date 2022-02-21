package com.bryce.book.core.theThirdChapter.three_one.notifyAll;

/**
 * @author huff
 * @date 2020/3/19 16:49
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();


        }
    }
}
