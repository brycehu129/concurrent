package com.bryce.book.core.theSeventhChapter.seven_four.formatError;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huff
 * @date 2020/3/27 0:16
 *
 * SimpleDateFormat非线程安全
 *
 * 类SimpleDateFormat主要负责日期的转换与格式化，但在多线程环境中，使用此类容易造成数据转换及处理的不准确，因为SimpleDateFormat类并不是线程安全的
 */
public class MyThread extends Thread{
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        super();
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef).toString();
            if (!newDateString.equals(dateString)){
                System.out.println("ThreadName="+Thread.currentThread().getName()+"报错了日期字符串："+dateString+" 转换成的日期为："+newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
