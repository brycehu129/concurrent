package com.bryce.book.core.theFourthChapter.four_one.tryLockTest;

/**
 * @author huff
 * @date 2020/3/24 17:32
 */
public class Run {
    public static void main(String[] args) {
        final MyService service=new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
