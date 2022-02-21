package com.bryce.book.core.theFristChapter.one_one;

/**
 * @author huff
 * @date 2019/11/16 16:02
 */
public class CallMainMethodMainThread {

    //public static void main()方法由jvm创建，输出的结果其实是一个叫做main的线程在执行输出操作
    //在控制台输出的main和main方法没有任何的关系，仅仅是名字相同而已
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }

}
