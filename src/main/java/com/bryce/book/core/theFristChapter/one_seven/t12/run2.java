package com.bryce.book.core.theFristChapter.one_seven.t12;

/**
 * @author huff
 * @date 2019/12/2 23:11
 */

/**
 * this.interrupted()具有清除状态的功能，即在第二次调用将返回false
 */
public class run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1? ="+Thread.interrupted());
        System.out.println("是否停止2? ="+Thread.interrupted());
        System.out.println("end!");
    }
}
