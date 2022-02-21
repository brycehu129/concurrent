package com.bryce.book.core.theSecondChapter.two_two.deadLockTest;

/**
 * @author huff
 * @date 2020/3/18 15:57
 */

/**
 * lock1和lock2都被锁住了，故产生了死锁现象
 */
public class DealThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username){
        this.username=username;
    }

    @Override
    public void run() {
        if (username.equals("a")){
            synchronized (lock1){
                try {
                    System.out.println("username="+username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2代码顺序执行了");
                }
            }
        }

        if (username.equals("b")){
            synchronized (lock2){
                try {
                    System.out.println("username="+username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按lock2->lock1代码顺序执行了");
                }
            }
        }
    }
}
