package com.bryce.book.core.theThirdChapter.three_three.InheritableThreadLocal2;

import java.util.Date;

/**
 * @author huff
 * @date 2020/3/20 17:57
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+" 我在子线程加的~！";
    }
}
