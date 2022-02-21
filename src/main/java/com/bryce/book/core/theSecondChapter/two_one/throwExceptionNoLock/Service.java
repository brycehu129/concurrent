package com.bryce.book.core.theSecondChapter.two_one.throwExceptionNoLock;

/**
 * @author huff
 * @date 2020/3/17 15:48
 */

/**
 * “出现异常，锁自动释放”
 *
 * 线程a出现异常并释放锁，线程b进入方法正常打印
 * 结论：出现异常的锁被释放
 */
public class Service {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()
                +" run beginTime="+System.currentTimeMillis());
            int i=1;
            while (i==1){
                if ((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName="+Thread.currentThread().getName()
                        +" run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run Time="+System.currentTimeMillis());
        }
    }
}
