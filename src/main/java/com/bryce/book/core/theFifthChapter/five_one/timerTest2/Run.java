package com.bryce.book.core.theFifthChapter.five_one.timerTest2;

/**
 * @author huff
 * @date 2020/3/24 19:42
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法 Schedule(TimerTask task,Date fristTime,long period)的测试：在指定的日期之后，按指定的间隔周期性地无限循环地执行某一任务
 *
 * 1.计划时间晚于当前时间：在未来执行的效果
 */
public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString="2020-03-24 19:49:00";
            Timer timer=new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task,dateRef,4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
