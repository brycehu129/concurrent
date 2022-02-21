package com.bryce.book.core.theSecondChapter.two_one.synLockIn_2;

/**
 * @author huff
 * @date 2020/3/17 15:43
 */
public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try {
            while (i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
