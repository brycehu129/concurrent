package com.bryce.book.core.theFifthChapter.five_one.timerTest1;

/**
 * @author huff
 * @date 2020/3/24 18:59
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法schedule(TimerTask task,Date time)的测试:该方法的作用是在指定的日期执行一次某一任务
 *
 * 1.执行任务的时间晚于当前时间：在未来执行的效果
 *
 * 从结果得知：任务执行完后，但进程还未销毁，呈红色状态
 * 查看Timer的构造方法得知：创建一个timer就是启动一个新的线程，这个新启动的线程并不是守护线程，它一直在运行
 */

public class Run1 {
    private static Timer timer = new Timer();
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
            String dateString="2020-10-12 11:55:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间："+new Date().toLocaleString());
            timer.schedule(task,dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
