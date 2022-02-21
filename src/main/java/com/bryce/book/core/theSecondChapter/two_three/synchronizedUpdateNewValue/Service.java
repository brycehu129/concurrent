package com.bryce.book.core.theSecondChapter.two_three.synchronizedUpdateNewValue;

/**
 * @author huff
 * @date 2020/3/18 18:26
 */

/**
 * 关键字synchronized可以使多个线程访问同一个资源具有同步性
 * 而且它还具有将线程工作内存中的私有变量与公共内存中的变量同步的功能
 */
public class Service {
    private boolean isContinue=true;


    //更改之前
    /*public void runMethod(){
        while (isContinue==true){
        }
        System.out.println("停下来了！");
    }*/

    //更改之后
    public void runMethod(){
        String anyThing = new String("adasd");
        while (isContinue==true){
            synchronized (anyThing){
                System.out.println("同步代码块中"+anyThing);
            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod(){
        //System.out.println("stopMethod");
        isContinue=false;
    }
}
