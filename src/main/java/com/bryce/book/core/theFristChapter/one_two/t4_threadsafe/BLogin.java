package com.bryce.book.core.theFristChapter.one_two.t4_threadsafe;

/**
 * @author huff
 * @date 2019/11/30 22:19
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
