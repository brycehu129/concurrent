package com.bryce.book.core.theThirdChapter.three_one.wait_notify_insert_test;

/**
 * @author huff
 * @date 2020/3/20 16:06
 */

/**
 * 实战：等待/通知之交叉备份
 *
 * 关键是使用了volatile private boolean prevIsA = false;实现了线程A和线程B交叉备份的效果
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools=new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output=new BackupB(dbTools);
            output.start();
            BackupA input=new BackupA(dbTools);
            input.start();
        }
    }
}
