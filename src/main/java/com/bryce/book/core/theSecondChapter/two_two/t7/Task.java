package com.bryce.book.core.theSecondChapter.two_two.t7;

/**
 * @author huff
 * @date 2020/3/17 16:33
 */


/**
 * 验证：同步代码块真的是同步的，且持有当前调用对象的锁
 *
 * 不在synchronized块中就是异步执行，在synchronized块中就是同步执行
 */
public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
