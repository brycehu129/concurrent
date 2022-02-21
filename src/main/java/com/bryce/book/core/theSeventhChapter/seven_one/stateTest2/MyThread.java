package com.bryce.book.core.theSeventhChapter.seven_one.stateTest2;

/**
 * @author huff
 * @date 2020/3/26 16:49
 *
 * 验证TIMED_WARNING
 *
 * 线程状态TIMED_WARNING代表线程执行了Thread.sleep()方法，呈等待状态，等待时间到达，继续向下运行
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("  end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
