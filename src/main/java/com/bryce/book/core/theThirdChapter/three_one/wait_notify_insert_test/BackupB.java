package com.bryce.book.core.theThirdChapter.three_one.wait_notify_insert_test;


/**
 * @author huff
 * @date 2020/3/20 16:05
 */
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
