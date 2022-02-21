package com.bryce.book.core.theThirdChapter.three_three.ThreadLocal22;

/**
 * @author huff
 * @date 2020/3/20 17:48
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值  第一次get不再为null";
    }
}
