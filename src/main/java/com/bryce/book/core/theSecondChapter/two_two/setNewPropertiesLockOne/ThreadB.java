package com.bryce.book.core.theSecondChapter.two_two.setNewPropertiesLockOne;

/**
 * @author huff
 * @date 2020/3/18 17:08
 */
public class ThreadB extends Thread {
    private Service service;
    private UserInfo userInfo;

    public ThreadB(Service service, UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
