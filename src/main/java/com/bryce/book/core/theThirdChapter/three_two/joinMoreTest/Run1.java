package com.bryce.book.core.theThirdChapter.three_two.joinMoreTest;

/**
 * @author huff
 * @date 2020/3/20 16:50
 */

/**
 * 方法join()后面的代码提前运行：出现意外
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b=new ThreadB();
            ThreadA a=new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("    main end "+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
