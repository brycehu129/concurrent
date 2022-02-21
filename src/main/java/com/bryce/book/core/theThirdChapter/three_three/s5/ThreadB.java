package com.bryce.book.core.theThirdChapter.three_three.s5;

import java.util.Date;

/**
 * @author huff
 * @date 2020/3/20 17:43
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("B "+Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
