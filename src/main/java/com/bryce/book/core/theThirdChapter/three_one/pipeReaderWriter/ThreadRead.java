package com.bryce.book.core.theThirdChapter.three_one.pipeReaderWriter;

import java.io.PipedReader;

/**
 * @author huff
 * @date 2020/3/20 15:46
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
