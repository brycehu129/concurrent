package com.bryce.book.core.theSixthChapter.six_two.singleton_1;

/**
 * @author huff
 * @date 2020/3/24 21:19
 *
 * 延迟加载/“懒汉模式”
 */

/**
 * 延迟加载：在调用get()方法时实例才被创建，常见的实现办法就是在get()方法中进行new实例化
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject(){

    }

    public static MyObject getInstance(){
        //延迟加载
        if (myObject!=null){

        }else {
            myObject=new MyObject();
        }
        return myObject;
    }
}
