package com.bryce.book.core.theSecondChapter.two_two.StringAndSyn;

/**
 * @author huff
 * @date 2020/3/18 1:36
 */

/**
 * JVM中String常量池案例
 */
public class Test {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        System.out.println(a==b);
    }
}
