package com.bryce.book.core.theSecondChapter.two_two.t6;

/**
 * @author huff
 * @date 2020/3/17 16:12
 */
public class MyThread1 extends  Thread{
    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1=System.currentTimeMillis();
    }
}
