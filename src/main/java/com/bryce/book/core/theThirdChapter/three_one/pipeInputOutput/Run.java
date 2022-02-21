package com.bryce.book.core.theThirdChapter.three_one.pipeInputOutput;

/**
 * @author huff
 * @date 2020/3/20 15:47
 */

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流是一种特殊的流，用于在不同线程间直接传输数据；
 * 一个线程发送数据到输出管道，另一个线程从输入管道中读数据
 *
 * 通过管道进行线程间交流：字节流
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData=new WriteData();
            ReadData readData=new ReadData();

            PipedInputStream inputStream=new PipedInputStream();
            PipedOutputStream outputStream=new PipedOutputStream();

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
