package com.bryce.book.core.theFristChapter.one_two.t1.randomThread;

/**
 * @author huff
 * @date 2019/11/16 16:12
 */
public class ThreadRandomness extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName()+"----random");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //测试
    public static void main(String[] args) {
        try {
            ThreadRandomness thread = new ThreadRandomness();
            thread.setName("ThreadRandomness");
            thread.start();  //这里相当于让ThreadRandomness类的线程准备就绪，随时可以被CPU调用其run方法
            //thread.run();  //这里如果直接调用run方法，则相当于同步执行，此线程对象将不会交给线程规划期去处理，而是由main主线程去调用run方法
            for (int i = 0; i < 10; i++) {
                //倘若这里不将线程挂起一段时间，那么由于thread.run()方法是交给main主线程来调用的，故就会出现main（）执行完之后才会调用run（）方法
                //即输出结果会是 10个main+10个ThreadRandomness的顺序，即成为了同步
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);//此处为了展现线程的随机性，将线程挂起，从而使CPU执行哪个线程具有不确定性
                System.out.println("main="+Thread.currentThread().getName()+"----main");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
