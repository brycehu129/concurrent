package com.bryce.book.core.theSecondChapter.two_one.t3;

/**
 * @author huff
 * @date 2020/3/17 14:51
 */

/**
 * 脏读:可通过synchronized关键字来解决
 * 同步方法setValue()的锁属于类PublicVar的实例
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";
    synchronized public void setValue(String username,String password){
        try {
            this.username=username;
            Thread.sleep(5000);
            this.password=password;
            System.out.println("setValue method thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*synchronized*/ public void getValue(){
        System.out.println("getValue method thread name="+Thread.currentThread().getName()+" username="+username+" password="+password);
    }
}
