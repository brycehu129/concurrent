package com.bryce.book.core.theSeventhChapter.seven_four.formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huff
 * @date 2020/3/27 0:28
 */
public class DateTools {
    public static Date parse(String formatPattern,String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern,Date date){
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}
