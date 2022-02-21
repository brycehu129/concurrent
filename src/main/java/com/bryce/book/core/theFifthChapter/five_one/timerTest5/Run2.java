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
 * 2.测试schedule方法任务延时
 *
 * 如果执行任务的时间被延时，则下一次执行任务的时间是上一次任务的结束时间为参考来计算
 */
public class Run2 {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为："+new Date());
                Thread.sleep(5000);   //被延时
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
            String dateString1 = "2020-03-24 20:38:00";
            Date dateRef = sdf.parse(dateString1);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task1,dateRef,2000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
