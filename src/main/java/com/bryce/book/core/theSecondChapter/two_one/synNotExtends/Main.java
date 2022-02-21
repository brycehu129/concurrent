package com.bryce.book.core.theSecondChapter.two_one.synNotExtends;

/**
 * @author huff
 * @date 2020/3/17 15:58
 */

/**
 * “同步不可以继承”
 */
public class Main {
    synchronized public void serviceMethod(){
        try {
            System.out.println("int main 下一步 sleep begin threadName="
                +Thread.currentThread().getName()+" time="
                +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName="
                    +Thread.currentThread().getName()+" time="
                    +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
