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
 * 4.测试scheduleAtFixedRate方法任务延时
 *
 * 如果执行任务的时间没有被延时，则下一次执行任务的时间以上一次任务的“结束”时的时间作为参考
 */
public class Run4 {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为："+new Date());
                Thread.sleep(5000);
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
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2020-03-24 20:54:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串时间："+dateRef1.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1,dateRef1,2000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
