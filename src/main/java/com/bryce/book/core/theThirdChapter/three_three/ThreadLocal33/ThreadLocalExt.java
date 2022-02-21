package com.bryce.book.core.theThirdChapter.three_three.ThreadLocal33;

import java.util.Date;

/**
 * @author huff
 * @date 2020/3/20 17:51
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
