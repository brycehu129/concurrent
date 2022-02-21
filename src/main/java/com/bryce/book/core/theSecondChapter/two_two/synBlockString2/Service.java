package com.bryce.book.core.theSecondChapter.two_two.synBlockString2;

/**
 * @author huff
 * @date 2020/3/17 17:28
 */

/**
 * synchronized(非this对象x)同步代码块，持有不同的对象就是异步执行的结果
 * 验证：synchronized(非this对象)与同步synchronized方法是异步调用的结果
 *
 */
public class Service {
    private String anyString = new String();

    /**
     * 同步代码块放在非同步synchronized方法中进行声明，并不能保证调用方法的线程的执行同步/顺序性，即线程调用方法的顺序是无序的
     */
    public void a(){
        try {
            synchronized (anyString){
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
