package com.bryce.book.core.theFifthChapter.five_one.timerTest1;

/**
 * @author huff
 * @date 2020/3/24 19:16
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  2.计划时间早于当前时间：提前运行的效果
 */
public class Run1_2 {

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString="2020-03-12 11:55:00";
            Timer timer=new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task,dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
