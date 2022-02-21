package com.bryce.book.core.theThirdChapter.three_one.waitOld;


/**
 * @author huff
 * @date 2020/3/19 20:50
 */
public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anything");
            lock.notifyAll();
        }
    }
}
