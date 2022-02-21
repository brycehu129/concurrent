package com.bryce.book.core.theFourthChapter.four_one.UseConditionWaitNotifyError;

/**
 * @author huff
 * @date 2020/3/24 14:22
 */

/**
 * 报错：监视器出错
 * 解决方法：必须在condition.await()方法调用之前调用lock.lock()代码获得同步监视器
 */
public class Run {
    public static void main(String[] args) {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.start();
    }
}
