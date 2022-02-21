package com.bryce.book.core.theThirdChapter.three_one.p_r_test;

/**
 * @author huff
 * @date 2020/3/19 21:12
 */


//生产者
public class P {
    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value=System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set的值是"+value);
                ValueObject.value=value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
