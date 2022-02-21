package com.bryce.book.core.theFristChapter.one_two.t1.randomThread;

/**
 * @author huff
 * @date 2019/11/16 16:36
 */


/**
 * 执行start()方法的顺序不代表线程启动的顺序
 */
public class ThreadSequence extends Thread{
    private int i;
    public ThreadSequence(int i){
        super();
        this.i=i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }

    //执行start的顺序并不代表线程执行的顺序
    public static void main(String[] args) {
        ThreadSequence t11=new ThreadSequence(1);
        ThreadSequence t12=new ThreadSequence(2);
        ThreadSequence t13=new ThreadSequence(3);
        ThreadSequence t14=new ThreadSequence(4);
        ThreadSequence t15=new ThreadSequence(5);
        ThreadSequence t16=new ThreadSequence(6);
        ThreadSequence t17=new ThreadSequence(7);
        ThreadSequence t18=new ThreadSequence(8);
        ThreadSequence t19=new ThreadSequence(9);
        ThreadSequence t110=new ThreadSequence(10);
        ThreadSequence t111=new ThreadSequence(11);
        ThreadSequence t112=new ThreadSequence(12);
        ThreadSequence t113=new ThreadSequence(13);
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t110.start();
        t111.start();
        t112.start();
        t113.start();
    }
}
