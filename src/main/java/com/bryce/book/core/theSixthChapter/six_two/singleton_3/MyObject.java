package com.bryce.book.core.theSixthChapter.six_two.singleton_3;

/**
 * @author huff
 * @date 2020/3/24 21:25
 *
 * 延迟加载/“懒汉模式”的解决方案
 *
 * 3.针对某些重要的代码进行单独的同步
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
        try {
            if (myObject!=null){

            }else {
                //模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                //使用synchronized(MyObject.class)
                //虽然部分代码被上锁
                //但还是有非线程安全问题
                synchronized (MyObject.class){
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
