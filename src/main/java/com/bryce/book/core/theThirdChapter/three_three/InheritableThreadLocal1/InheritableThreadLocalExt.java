package com.bryce.book.core.theThirdChapter.three_three.InheritableThreadLocal1;

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
}
