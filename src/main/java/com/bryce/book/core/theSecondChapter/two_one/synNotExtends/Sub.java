package com.bryce.book.core.theSecondChapter.two_one.synNotExtends;

/**
 * @author huff
 * @date 2020/3/17 16:01
 */
public class Sub extends Main {
    @Override
    public  void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName="
                    +Thread.currentThread().getName()+" time="
                    +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName="
                    +Thread.currentThread().getName()+" time="
                    +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
