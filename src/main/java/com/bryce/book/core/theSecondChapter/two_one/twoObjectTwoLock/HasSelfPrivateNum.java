package com.bryce.book.core.theSecondChapter.two_one.twoObjectTwoLock;

/**
 * @author huff
 * @date 2020/3/17 14:17
 */

/**
 * 两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，结果却是异步的；
 * 同步方法持有的是对象锁，而此时多个线程访问的是不同的对象，故不是同一个锁，所以结果呈现为异步
 * （证明线程锁的是对象，见synchronizedMethodLockObject）
 */
public class HasSelfPrivateNum {
    private int num;
    synchronized public void addI(String username){
        try {
            if (username.equals("a")){
                num=100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num=200;
                System.out.println("b set over!");
            }
            System.out.println(username+" num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
