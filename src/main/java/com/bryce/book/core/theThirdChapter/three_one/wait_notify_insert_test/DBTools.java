package com.bryce.book.core.theThirdChapter.three_one.wait_notify_insert_test;

/**
 * @author huff
 * @date 2020/3/20 16:02
 */
public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backupA(){
        try {
            while (prevIsA == true){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★");
            }
            prevIsA=true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (prevIsA=false){
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
            prevIsA=false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
