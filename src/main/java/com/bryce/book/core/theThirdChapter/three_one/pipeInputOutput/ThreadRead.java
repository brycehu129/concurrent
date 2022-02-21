package com.bryce.book.core.theThirdChapter.three_one.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @author huff
 * @date 2020/3/20 15:46
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
