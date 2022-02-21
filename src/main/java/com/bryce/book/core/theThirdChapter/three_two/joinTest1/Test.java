package com.bryce.book.core.theThirdChapter.three_two.joinTest1;

/**
 * @author huff
 * @date 2020/3/20 16:14
 */
public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        //Thread.sleep(?);
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中sleep()中的值应该写多少呢？");
        System.out.println("答案是：根本不能确定");
    }
}
