package com.bryce.special.column.condition;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author bryce
 * @version 1.0
 * @date 2021/10/21 21:04
 * @description todo
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("231");
        a.add("123");
        a.add("41");
        a.add("213");
        System.out.println(a.toString());

        String[] b = new String[3];
        PriorityQueue queue = new PriorityQueue(b.length, (d, e) -> (d.hashCode() - e.hashCode()));
        queue.poll();


    }

}
