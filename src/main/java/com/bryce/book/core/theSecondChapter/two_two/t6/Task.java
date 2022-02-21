package com.bryce.book.core.theSecondChapter.two_two.t6;

/**
 * @author huff
 * @date 2020/3/17 16:07
 */

/**
 * 当一个线程访问object的一个synchronized同步代码块时，另一个线程依然可以访问该object对象中的非synchronized(this)代码块
 * 这里使用synchronized同步代码块时间缩短，运行效率加快
 */
public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String privateGetData1="长时间处理任务后从远程返回的值1 threadName="+Thread.currentThread().getName();
            String privateGetData2="长时间处理任务后从远程返回的值2 threadName="+Thread.currentThread().getName();
            synchronized (this){
                getData1=privateGetData1;
                getData2=privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
