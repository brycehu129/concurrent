package com.bryce.book.core.theThirdChapter.three_one.p_r_test;

/**
 * @author huff
 * @date 2020/3/19 21:15
 */

//消费者
public class C {
    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是"+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
