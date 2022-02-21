package com.bryce.book.core.theSixthChapter.six_two.singleton_5;

/**
 * @author huff
 * @date 2020/3/24 21:25
 *
 * 延迟加载/“懒汉模式”的解决方案
 *
 * 4.使用DCL双检查锁机制
 */
public class MyObject {
    private volatile static MyObject myObject;

    private MyObject(){}

    //使用双监测机制来解决问题，既保证了不需要同步代码的异步执行性
    //又保证了单例的效果

    public static MyObject getInstance(){
        try {
            if (myObject!=null){

            }else {
                //模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if (myObject==null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
    //此版本的代码称为双重检查Double-check Locking
}
