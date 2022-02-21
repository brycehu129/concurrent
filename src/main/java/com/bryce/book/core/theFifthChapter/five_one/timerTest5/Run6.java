package com.bryce.book.core.theFifthChapter.five_one.timerTest5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author huff
 * @date 2020/3/24 20:23
 */

/**
 * 6.验证scheduleAtFixedRate方法具有追赶执行性
 *
 * 即指定时间与当前时间之间的task任务被“补充性”执行了，即task任务追赶执行的特性
 */
public class Run6 {
    private static Timer timer = new Timer();
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            System.out.println("1 begin 运行了！时间为："+new Date());
            System.out.println("1   end 运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2020-03-24 20:54:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串时间："+dateRef1.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1,dateRef1,5000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
