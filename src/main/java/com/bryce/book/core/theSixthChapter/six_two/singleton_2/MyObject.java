package com.bryce.book.core.theSixthChapter.six_two.singleton_2;

/**
 * @author huff
 * @date 2020/3/24 21:25
 *
 * 延迟加载/“懒汉模式”的缺点
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
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
