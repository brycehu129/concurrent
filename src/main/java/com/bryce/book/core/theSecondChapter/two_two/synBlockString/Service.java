package com.bryce.book.core.theSecondChapter.two_two.synBlockString;

/**
 * @author huff
 * @date 2020/3/17 17:12
 */

/**
 *如果在一个类中有很多个synchronized方法，这时虽然能实现同步，但会受到阻塞，影响运行效率；
 * 若使用同步代码块锁非this对象，则synchronized(非this)代码块中的程序与同步方法是异步的，不与其他锁this同步方法争抢this锁，则可提高运行效率
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    /*private String anyString=new String();*/

    public void setUsernamePassword(String username,String password){
        try {
            String anyString=new String();   //此时为方法内变量，即不是同一个对象监视器
            synchronized (anyString){
                System.out.println("线程名称为："+Thread.currentThread().getName()
                    +"在"+System.currentTimeMillis()+"进入同步块");
                usernameParam=username;
                Thread.sleep(3000);
                passwordParam=password;
                System.out.println("线程名称为:"+Thread.currentThread().getName()
                        +"在"+System.currentTimeMillis()+"离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
