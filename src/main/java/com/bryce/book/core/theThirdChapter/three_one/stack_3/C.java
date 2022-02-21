package com.bryce.book.core.theThirdChapter.three_one.stack_3;

/**
 * @author huff
 * @date 2020/3/20 15:15
 */

//消费者
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
