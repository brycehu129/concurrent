package com.bryce.book.core.theSecondChapter.two_two.setNewPropertiesLockOne;

/**
 * @author huff
 * @date 2020/3/18 17:05
 */

/**
 * 主要对象不变，即使对象的属性被改变，运行的结果还是同步
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo){
        synchronized (userInfo){
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
