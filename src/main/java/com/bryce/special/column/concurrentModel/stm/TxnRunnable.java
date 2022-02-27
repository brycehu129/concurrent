package com.bryce.special.column.concurrentModel.stm;

/**
 * @author bryce
 * @version 1.0.0
 * @Description TODO
 */
@FunctionalInterface
public interface TxnRunnable {

    void run(Txn txn);

}
