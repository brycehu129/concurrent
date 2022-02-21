package com.bryce.book.core.theSecondChapter.two_two.test3;

import com.bryce.book.core.theSecondChapter.two_two.test2.MyObject;
import com.bryce.book.core.theSecondChapter.two_two.test2.Service;

/**
 * @author huff
 * @date 2020/3/18 0:47
 */
public class ThreadA extends  Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
