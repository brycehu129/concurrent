package com.bryce.book.core.theSecondChapter.two_three.volatileTestThread;

/**
 * @author huff
 * @date 2020/3/18 17:52
 */

/**
 * 关键字volatile主要使用的场合是在多个线程中可以感知实例变量被更改了，并且可以获得最新的值来使用
 * 也就是用多线程读取共享变量时可以获得最新值使用
 *
 * 关键字volatile提示线程每次从共享内存中读取变量，而不是从私有内存中读取，这样就保证了同步数据的可见性
 *
 * 但需要注意：如果需要修改实例变量中的数据，比如i++，也就是i=i+1;则这样的操作并不是一个原子操作，也就是非线程安全的
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadArray[i]=new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadArray[i].start();
        }
    }
}
