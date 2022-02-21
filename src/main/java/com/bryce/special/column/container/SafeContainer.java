package com.bryce.special.column.container;

import java.util.*;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/20 21:47
 * @description todo
 */
public class SafeContainer {

    public static void main(String[] args) {
        List list = Collections.synchronizedList(new ArrayList<>());
        Set set = Collections.synchronizedSet(new HashSet<>());
        Map map = Collections.synchronizedMap(new HashMap<>());
    }

    class SafeArrayList<T> {
        //封装ArrayList
        List<T> c = new ArrayList<>();

        //控制访问路径
        synchronized T get(int idx) {
            return c.get(idx);
        }

        synchronized void add(int idx, T t) {
            c.add(idx, t);
        }

        synchronized boolean addIfNotExist(T t) {   //addIfNotExist存在竟态条件问题
            if (!c.contains(t)) {
                c.add(t);
                return true;
            }
            return false;
        }

        //注意：用迭代器遍历容器
        public void errExample(){
            List list = Collections. synchronizedList(new ArrayList());
            Iterator i = list.iterator();
            while (i.hasNext()){
                foo(i.next());
            }
        }

        private void foo(Object next) {

            //可能不具备原子性

        }

        public void rightExample(){
            List list = Collections. synchronizedList(new ArrayList());
            synchronized (list){
                Iterator i = list.iterator();
                while (i.hasNext()){
                    foo(i.next());
                }
            }
        }


    }

}
