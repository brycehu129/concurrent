package com.bryce.book.core.theThirdChapter.three_one.pipeReaderWriter;

import java.io.PipedWriter;

/**
 * @author huff
 * @date 2020/3/20 15:45
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.waiteMethod(out);
    }
}
