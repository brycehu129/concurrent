package com.bryce.book.core.theFourthChapter.four_one.lockInterruptiblyTest2;

/**
 * @author huff
 * @date 2020/3/24 17:22
 */

/**
 * 线程B被interrupt中断了，执行lockInterruptibly()则出现异常
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();  //打标记
        System.out.println("main end！");
    }
}
