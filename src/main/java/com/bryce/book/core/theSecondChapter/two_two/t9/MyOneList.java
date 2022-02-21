package com.bryce.book.core.theSecondChapter.two_two.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huff
 * @date 2020/3/18 0:16
 */
public class MyOneList {
    private List list = new ArrayList();

    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }
}
