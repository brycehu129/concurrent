package com.bryce.special.column.theory;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/7 19:40
 * @description 验证可见性问题:CPU缓存导致的可见性问题
 */
public class Visibility {
    private static long count = 0;

    private void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {
        final Visibility test = new Visibility();
        // 创建两个线程，执行add()操作
        Thread th1 = new Thread(()->{
            test.add10K();
        });
        Thread th2 = new Thread(()->{
            test.add10K();
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        th2.join();
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Visibility.calc());
        /*Visibility visibility = new Visibility();
        System.out.println(visibility.calc());*/
    }

}
