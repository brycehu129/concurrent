package com.bryce.book.core.theThirdChapter.three_one.notifyHoldLock;

/**
 * @author huff
 * @date 2020/3/19 16:33
 */
public class SynNotifyMethodThread extends Thread {
    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.synNotifyMethod(lock);
    }
}
