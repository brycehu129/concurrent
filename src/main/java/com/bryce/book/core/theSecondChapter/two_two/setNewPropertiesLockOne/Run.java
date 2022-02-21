package com.bryce.book.core.theSecondChapter.two_two.setNewPropertiesLockOne;

/**
 * @author huff
 * @date 2020/3/18 17:09
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            UserInfo userInfo=new UserInfo();
            ThreadA a =new ThreadA(service,userInfo);
            a.setName("a");
            a.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(service,userInfo);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
