package com.bryce.book.core.theSixthChapter.six_one.singleton_0;

/**
 * @author huff
 * @date 2020/3/24 21:11
 *
 * 立即加载/“饿汉模式”
 */

/**
 * 立即加载：使用类的时候已经将对象创建完毕，常见的实现是直接new实例化，也称为“饿汉模式”
 */
public class MyObject {
    //立即加载方式 == 饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject(){

    }

    public static MyObject getInstance(){
        //此代码版本为立即加载
        //此版本代码的缺点是不能有其他实例变量
        //因为getInstance()方法没有同步
        //所以有可能出现非线程安全问题
        return myObject;
    }
}
