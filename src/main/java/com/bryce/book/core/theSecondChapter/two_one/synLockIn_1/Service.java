package com.bryce.book.core.theSecondChapter.two_one.synLockIn_1;

/**
 * @author huff
 * @date 2020/3/17 15:04
 */

/**
 * synchronized锁重入：在使用synchronized时，当一个线程得到一个对象锁后，再次请求此对象锁时是可以再次得到该对象的锁的；
 * 即在一个synchronized方法/块的内部调用该类的其他synchronized方法/块时，是永远可以得到锁的
 *
 * 可重入锁：自己可以再次获取自己的内部锁
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}
