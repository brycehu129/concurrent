package com.bryce.book.core.theSixthChapter.six_two.singleton_2_2;

/**
 * @author huff
 * @date 2020/3/24 21:25
 *
 * 延迟加载/“懒汉模式”的解决方案
 *
 * 2.尝试同步代码块
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
        try {
            //此种写法等同于：
            //synchronized public static MyObject getInstance()
            //的写法，效率一样很低，全部代码被上锁
            synchronized (MyObject.class){
                if (myObject!=null){

                }else {
                    //模拟在创建对象之前做一些准备性的工作
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
