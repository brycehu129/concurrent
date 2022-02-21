package com.bryce.book.core.theThirdChapter.three_one.notifyHoldLock;

/**
 * @author huff
 * @date 2020/3/19 16:32
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.synNotifyMethod(lock);
    }
}
