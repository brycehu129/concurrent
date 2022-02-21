package com.bryce.book.core.theSecondChapter.two_two.syn_out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huff
 * @date 2020/3/18 0:04
 */

/**
 * 这里的结果：同步块中的代码是同步的，即执行与退出成对出现，但线程A和线程B是异步的；
 * 有可能出现脏读的情况，见t9
 */
public class MyList {
    private List list=new ArrayList();

    synchronized public void add(String username){
        System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了add方法！");
        list.add(username);
        System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了add方法！");
    }

    synchronized public int getSize(){
        System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了getSize方法！");
        int sizeValue=list.size();
        System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了getSize方法！");
        return sizeValue;
    }
}
