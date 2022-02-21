package com.bryce.book.core.theFourthChapter.four_one.lockMethodTest3.test3;

/**
 * @author huff
 * @date 2020/3/24 17:07
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
