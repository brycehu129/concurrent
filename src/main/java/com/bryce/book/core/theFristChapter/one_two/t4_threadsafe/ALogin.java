package com.bryce.book.core.theFristChapter.one_two.t4_threadsafe;

/**
 * @author huff
 * @date 2019/11/30 22:18
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
