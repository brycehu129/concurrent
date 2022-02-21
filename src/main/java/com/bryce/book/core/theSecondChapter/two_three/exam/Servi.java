package com.bryce.book.core.theSecondChapter.two_three.exam;

/**
 * @author huff
 * @date 2020/3/18 18:55
 */
public class Servi {
    private boolean isContinue=true;

    public void runMethod(){
        while (isContinue==true){
            System.out.println("runMethod中的while但为进入同步代码块");
            /*synchronized (""){
                System.out.println("同步代码块中");
            }*/
        }
        System.out.println("停下来了！");
    }

    public void stopMethod(){
        isContinue=false;
        System.out.println("stopMethod isContinue已经修改为false");
        for (int i = 0; i < 1000; i++) {
            System.out.println("stopMethod i="+i);
        }
    }
}
