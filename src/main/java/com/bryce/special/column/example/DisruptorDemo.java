package com.bryce.special.column.example;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.util.DaemonThreadFactory;

import java.nio.ByteBuffer;

/**
 * @author bryce
 * @version 1.0
 * @date 2022/2/27 16:49
 * @description Disruptor
 */
public class DisruptorDemo {

    //自定义Event
    static class LongEvent {
        private long value;

        public void set(long value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //指定RingBuffer大小,
        //必须是2的N次方
        int bufferSize = 1024;
        //构建Disruptor
        Disruptor<LongEvent> disruptor = new Disruptor<>(LongEvent::new,
                bufferSize,
                DaemonThreadFactory.INSTANCE);
        //注册事件处理器
        disruptor.handleEventsWith((event, sequence, endOfBatch) -> System.out.println("E: " + event));
        //启动
        disruptor.start();
        //获取RingBuffer
        RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();
        //生产Event
        ByteBuffer bb = ByteBuffer.allocate(8);
        for (long l = 0; true; l++) {
            bb.putLong(0, l);
            //生产者生产消息
            ringBuffer.publishEvent((event, sequence, buffer) -> event.set(buffer.getLong(0)), bb);
            Thread.sleep(1000);
        }
    }

}
