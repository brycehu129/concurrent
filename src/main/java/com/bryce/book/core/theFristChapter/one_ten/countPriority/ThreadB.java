package com.bryce.book.core.theFristChapter.one_ten.countPriority;

/**
 * @author huff
 * @date 2020/3/16 15:48
 */
public class ThreadB extends Thread {
    private int count = 0;

    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}
