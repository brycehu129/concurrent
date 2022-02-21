package com.bryce.book.core.theSixthChapter.six_five.singleton_8;

/**
 * @author huff
 * @date 2020/3/25 15:39
 *
 * 使用static代码块实现单例模式
 */
public class MyObject {
    private static MyObject instance = null;

    private MyObject(){}

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance(){
        return instance;
    }
}
