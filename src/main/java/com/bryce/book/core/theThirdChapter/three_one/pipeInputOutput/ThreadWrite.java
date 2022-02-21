package com.bryce.book.core.theThirdChapter.three_one.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @author huff
 * @date 2020/3/20 15:45
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.waiteMethod(out);
    }
}
