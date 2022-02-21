package com.bryce.book.core.theSecondChapter.two_one.synNotExtends;

/**
 * @author huff
 * @date 2020/3/17 16:03
 */


/**
 * 同步不可以继承，还得在子类的方法中添加synchronized关键字
 */
public class Test {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();
        MyThreadB b= new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
