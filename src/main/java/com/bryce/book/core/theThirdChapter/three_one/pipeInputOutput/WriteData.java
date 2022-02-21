package com.bryce.book.core.theThirdChapter.three_one.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author huff
 * @date 2020/3/20 15:40
 */
public class WriteData {
    public void waiteMethod(PipedOutputStream out){
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = ""+(i+1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
