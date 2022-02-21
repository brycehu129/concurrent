package com.bryce.book.core.theSecondChapter.two_three.exam;

/**
 * @author huff
 * @date 2020/3/18 18:29
 */

/**
 * 关键字synchronized可以保证在同一时刻，只有一个线程可以执行某一个方法或某一个代码块。
 * 它包含两个特征：互斥性和可见性。
 * 同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，都看到由同一个锁保护之前的修改结果
 *
 * 结果分析：没有加synchronized (anyThing){}时，两个线程的对象监视器都是service，故陷入了死循环；
 * 此时加了之后，a线程访问
 */
public class Run {
    public static void main(String[] args) {
        try {
            Servi service=new Servi();
            ThreadA a=new ThreadA(service);
            a.start();
            Thread.sleep(10);
            ThreadB b=new ThreadB(service);
            b.start();
            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
