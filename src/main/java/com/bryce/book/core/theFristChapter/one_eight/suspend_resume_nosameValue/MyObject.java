package com.bryce.book.core.theFristChapter.one_eight.suspend_resume_nosameValue;

/**
 * @author huff
 * @date 2020/3/16 15:06
 */

/**
 * 使用suspend和resume方法时也容易出现由于线程的暂停而导致数据不同步的情况
 */
public class MyObject {
    private String username= "1";
    private String password= "11";
    public void setValue(String u,String p){
        this.username=u;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password=p;
    }

    public void printUsernamePassword(){
        System.out.println(username+" "+password);
    }
}
