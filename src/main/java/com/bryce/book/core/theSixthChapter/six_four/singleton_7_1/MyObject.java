package com.bryce.book.core.theSixthChapter.six_four.singleton_7_1;

import java.io.Serializable;

/**
 * @author huff
 * @date 2020/3/24 21:25
 *
 * 序列化与反序列化的单例模式实现
 *
 * 静态内置类可以达到线程安全问题，但遇到序列化对象，使用默认的方式运行得到的结果还是多例的
 */
public class MyObject implements  Serializable{


    private static final long serialVersionUID = 7843580835139296197L;

    //内部类方式
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){}

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    /*protected Object readResolve() throws ObjectStreamException{
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }*/
}
