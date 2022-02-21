package com.bryce.book.core.theThirdChapter.three_one.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huff
 * @date 2020/3/19 16:03
 */

/**
 * wait()方法：使调用该方法的线程释放共享资源的锁，然后从运行状态退出，进入等待队列，直到被再次唤醒
 * notify()方法：可以随机唤醒等待队列中等待同一共享资源的“一个”线程，并使该线程退出等待队列，进行可运行状态，也就是notify()方法仅通知“一个”线程
 * notifyAll方法：可以使所有正在等待队列中等待同一共享资源的”全部“线程从等待状态退出，进入可运行状态。此时，优先级最高的那个线程先执行，但也有可能是随机执行，取决于JVM的实现
 *
 * 每个锁对象都有两个队列
 * 1.就绪队列：存储了将要获得锁的线程，线程被唤醒，就会进入就绪队列，等待CPU的调度
 * 2.阻塞队列：一个线程被wait后，就会进入阻塞队列，等待下一次被唤醒
 */
public class MyList {
    private static List list=new ArrayList();

    public static void add(){
        list.add("huff");
    }

    public static int size(){
        return list.size();
    }
}
