package com.bryce.book.core.theThirdChapter.three_one.waitReleaseLock;

/**
 * @author huff
 * @date 2020/3/19 16:22
 */

/**
 * 方法wait()被执行后，锁被自动释放；但执行完notify()方法，锁却不自动释放
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait()");
                //lock.wait();
                Thread.sleep(40000);  //将wait方法替换为sleep，就成了同步的效果
                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
