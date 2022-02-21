package com.bryce.book.core.theSecondChapter.two_one.synchronizedMethodLockObject;

/**
 * @author huff
 * @date 2020/3/17 14:29
 */

/**
 * 调用用synchronized关键字声明的方法一定是排队运行的；
 * 只有共享资源的读写访问才需要同步化
 */
public class MyObject {
    /*synchronized*/ public void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
