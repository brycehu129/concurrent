package com.bryce.book.core.theFifthChapter.five_one.timerTest5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author huff
 * @date 2020/3/24 20:23
 *
 * 方法scheduleAtFixedRate(TimerTask task,Date fristTime,long period)的测试
 *
 * 1.方法schedule和方法scheduleAtFixedRate都会按顺序执行，所以不需要考虑非线程安全的情况；
 * 2.方法schedule和方法scheduleAtFixedRate主要的区别只在于不延时的情况
 *
 * 没有被延时的情况：
 * （1）使用schedule方法，下一次任务的执行时间参考的是上一次任务的“开始”时的时间+delay；
 * （2）使用scheduleAtFixedRate方法，下一次任务的执行时间参考的是上一次任务的“结束”时的时间+delay；
 *
 * 延时的情况下：下一次任务的执行时间参考的是上一次任务的“结束”时的时间作为参考；
 */

/**
 * 1.测试schedule方法任务不延时
 *
 * 在不延时情况下，如果执行任务的时间没有被延时，则下一次执行任务的时间是上一次任务的开始时间加上delay时间
 */
public class Run1 {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为："+new Date());
                Thread.sleep(1000);
                System.out.println("1   end 运行了！时间为："+new Date());
                runCount++;
                if (runCount==5){
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2020-03-24 20:39:00";
            Date dateRef = sdf.parse(dateString1);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task1,dateRef,3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
