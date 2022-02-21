package com.bryce.book.core.theSecondChapter.two_two.synchronizedOneThreadIn;

/**
 * @author huff
 * @date 2020/3/17 16:18
 */

/**
 * synchronized同步代码块，执行效率依然很低，执行效果仍然是同步
 */
public class ObjectService {
    public void serviceMethod(){
        try {
            synchronized (this){
                System.out.println("begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end   time="+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
