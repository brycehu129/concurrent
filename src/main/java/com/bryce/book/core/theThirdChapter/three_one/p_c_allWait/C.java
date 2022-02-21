package com.bryce.book.core.theThirdChapter.three_one.p_c_allWait;

/**
 * @author huff
 * @date 2020/3/19 21:39
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
                while (ValueObject.value.equals("")){
                    System.out.println("消费者 "+Thread.currentThread().getName()+" WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 "+Thread.currentThread().getName()+" RUNNING了");
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
