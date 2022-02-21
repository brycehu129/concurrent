package com.bryce.book.core.theFifthChapter.five_one.timerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author huff
 * @date 2020/3/24 20:14
 *
 * 方法schedule(TimerTask task,long delay)的测试：以执行schedule(TimerTask task,long delay)方法当前的时间为参考时间，
 * 在此时间基础上延迟指定的毫秒数后执行一次TimerTask任务
 */
public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间："+new Date().toLocaleString());
        timer.schedule(task,7000);
    }
}
