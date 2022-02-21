package com.bryce.book.core.theThirdChapter.three_one.TwoThreadTransData;

/**
 * @author huff
 * @date 2020/3/18 20:05
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 使用sleep()结合while(true)死循环来实现多个线程间通信
 */
public class MyList {
    private List list=new ArrayList();

    public void add(){
        list.add("huff");
    }

    public int size(){
        return list.size();
    }

}
