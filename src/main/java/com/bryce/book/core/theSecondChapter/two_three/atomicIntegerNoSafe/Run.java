package com.bryce.book.core.theSecondChapter.two_three.atomicIntegerNoSafe;

/**
 * @author huff
 * @date 2020/3/18 18:11
 */

/**
 * 打印顺序出错，应该是每加一次100再加一次1，这是因为addAndGet()方法是原子的，但方法和方法之间的调用却不是原子的；
 * 可能在打印时，线程1已经执行addAndGet，此时线程2进入执行addAndGet并打印，而后线程1再执行，故出现打印顺序错误
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService service=new MyService();
            MyThread[] array=new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i]=new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
