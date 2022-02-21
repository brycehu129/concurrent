package com.bryce.book.core.theFourthChapter.four_one.tryLock_param;

/**
 * @author huff
 * @date 2020/3/24 17:38
 */

/**
 * 线程B超时没有获得锁
 */
public class Run2 {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"调用waitMethod时间："+System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
