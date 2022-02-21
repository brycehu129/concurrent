package com.bryce.book.core.theThirdChapter.three_one.pipeReaderWriter;

/**
 * @author huff
 * @date 2020/3/20 15:47
 */

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 通过管道进行线程间交流：字符流
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData=new WriteData();
            ReadData readData=new ReadData();

            PipedReader inputStream=new PipedReader();
            PipedWriter outputStream=new PipedWriter();

            //inputStream.connect(outputStream);
            outputStream.connect(inputStream);  //使两个线程之间产生通信链接

            ThreadRead threadRead=new ThreadRead(readData,inputStream);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);
            threadWrite.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
