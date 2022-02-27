package com.bryce.special.column.concurrentModel.stm;

/**
 * @author bryce
 * @version 1.0.0
 * @Description 实现STM，并完成线程安全的转账操作
 */
public class Account {

    //余额
    private TxnRef<Integer> balance;

    //构造方法
    public Account(int balance) {
        this.balance = new TxnRef<Integer>(balance);
    }

    //转账操作
    public void transfer(Account target, int amt) {
        STM.atomic((txn) -> {
            Integer from = balance.getValue(txn);
            balance.setValue(from - amt, txn);
            Integer to = target.balance.getValue(txn);
            target.balance.setValue(to + amt, txn);
        });
    }

}
