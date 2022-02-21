package com.bryce.book.core.theThirdChapter.three_one.stack_2_new;

/**
 * @author huff
 * @date 2020/3/20 15:13
 */

//生产者
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
