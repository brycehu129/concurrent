package com.bryce.book.core.theSecondChapter.two_two.innerTest1;

/**
 * @author huff
 * @date 2020/3/18 16:31
 */

/**
 * 验证：在内置类中有两个同步方法，但使用的却是不同的锁，打印的结果是异步的
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void method2(){
            for (int i = 11; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+" i="+i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
