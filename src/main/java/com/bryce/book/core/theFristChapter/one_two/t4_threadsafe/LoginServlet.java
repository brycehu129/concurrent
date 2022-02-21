package com.bryce.book.core.theFristChapter.one_two.t4_threadsafe;

/**
 * @author huff
 * @date 2019/11/30 22:15
 */
public class LoginServlet {
    /**
     * 此处出现 非线程安全主要是因为 usernameRef和passwordRef均为 类变量
     * 即两个线程争抢同一实例变量而引起非线程安全
     */
    private static String usernameRef;
    private static String passwordRef;
    //若想保证线程安全，只需在方法上加关键字即可
 /*   synchronized*/ public static void doPost(String username,String password){
        try {
            usernameRef=username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef=password;
            System.out.println("username="+usernameRef+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ALogin a=new ALogin();
        a.start();
        BLogin b=new BLogin();
        b.start();
    }
}
