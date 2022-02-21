package com.bryce.book.core.theSeventhChapter.seven_four.formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huff
 * @date 2020/3/27 0:16
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
            Date dateRef = DateTools.parse("yyyy-MM-dd",dateString);
            String newDateString = DateTools.format("yyyy-MM-dd",dateRef).toString();
            if (!newDateString.equals(dateString)){
                System.out.println("ThreadName="+Thread.currentThread().getName()+"报错了日期字符串："+dateString+" 转换成的日期为："+newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
