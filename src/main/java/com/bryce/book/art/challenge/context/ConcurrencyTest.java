package com.bryce.book.art.challenge.context;

/**
 * @author bryce
 * @version 1.0
 * @date 2021/8/22 13:35
 * @description todo
 */
public class ConcurrencyTest {

    private static final long count = 100001;


    private static void concurrency() throws InterruptedException{
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a+=5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis()-start;
        thread.join();  //当前线程需要等待被调用线程终止才可以运行，即需要等待thread线程执行完毕才可以执行，目前即阻塞在这一行
        System.out.println("concurrency :"+time+"ms.b="+b);
    }

    private static void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a+=5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis()-start;
        System.out.println("serial:"+time+"ms,b="+b+",a="+a);
    }

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }


}
