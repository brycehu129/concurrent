package com.bryce.book.core.theThirdChapter.three_three.ThreadLocal22;

/**
 * @author huff
 * @date 2020/3/20 17:48
 */

/**
 * 解决get()返回null问题
 */

public class Run {
    public static ThreadLocalExt t1=new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get()==null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
