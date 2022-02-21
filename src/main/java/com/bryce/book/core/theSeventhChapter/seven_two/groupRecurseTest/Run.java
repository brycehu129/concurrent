package com.bryce.book.core.theSeventhChapter.seven_two.groupRecurseTest;

/**
 * @author huff
 * @date 2020/3/26 23:20
 *
 * 递归与非递归取得组内对象
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();    //mainGroup表示当前main线程组
        ThreadGroup groupA = new ThreadGroup(mainGroup,"A");   //将A加入main线程组
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("runMethod!");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadGroup groupB = new ThreadGroup(groupA,"B");  //将B加入A的线程组
        //分配空间，但不一定全部用完
        ThreadGroup[] listGroup1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        //传入true是递归取得子组及子孙组
        Thread.currentThread().getThreadGroup().enumerate(listGroup1,true);
        System.out.println("listGroup1:");
        for (int i = 0; i < listGroup1.length; i++) {
            if (listGroup1[i]!=null){
                System.out.println(listGroup1[i].getName());
            }
        }

        ThreadGroup[] listGroup2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup2,false);
        System.out.println("listGroup2:");
        for (int i = 0; i < listGroup2.length; i++) {
            if (listGroup2[i]!=null){
                System.out.println(listGroup2[i].getName());
            }
        }
    }
}
