package com.bryce.book.core.theSeventhChapter.seven_four.formatOK2;

import java.text.SimpleDateFormat;

/**
 * @author huff
 * @date 2020/3/27 0:28
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern){
        SimpleDateFormat sdf = null;
        sdf = t1.get();
        if (sdf==null){
            sdf = new SimpleDateFormat(datePattern);
            t1.set(sdf);
        }
        return sdf;
    }
}
