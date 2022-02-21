package com.bryce.book.core.theSixthChapter.six_three.singleton_7;

/**
 * @author huff
 * @date 2020/3/24 21:25
 *
 * 使用静态内置类实现单例模式
 */
public class MyObject {
    //内部类方式
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){}

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
