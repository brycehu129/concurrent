package com.bryce.book.core.theThirdChapter.three_one.test1;

/**
 * @author huff
 * @date 2020/3/19 15:56
 */

/**
 * 报了异常，原因是没有“对象监视器”，也就是没有同步加锁
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
