package com.bryce.book.core.theThirdChapter.three_one.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @author huff
 * @date 2020/3/20 15:43
 */
public class ReadData {
    public void readMethod(PipedReader input){
        try {
            System.out.println("read:");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
            while (readLength!=-1){
                String newData = new String(byteArray,0,readLength);
                System.out.println(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
