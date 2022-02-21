package com.bryce.book.core.theThirdChapter.three_two.joinLong;

/**
 * @author huff
 * @date 2020/3/20 16:28
 */

/**
 * 方法join(long)中的参数是设定等待的时间
 *
 * 方法join(long)与sleep(long)的区别：
 * 1.方法join(long)的内部使用wait(long)来实现的，当执行wait(long)方法后，当前线程的锁被释放，其他线程就可以调用此线程中的同步方法了
 * 2.方法sleep(long)却不会释放锁，见join_sleep_1
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest=new MyThread();
            threadTest.start();
            threadTest.join(2000);  //只等2秒
            //Thread.sleep(2000);
            System.out.println("  end time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
