package com.bryce.book.core.theSecondChapter.two_one.t3;

/**
 * @author huff
 * @date 2020/3/17 14:55
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(200);  //打印结果受此值大小影响
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
