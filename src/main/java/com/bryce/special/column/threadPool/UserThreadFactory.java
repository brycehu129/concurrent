package com.bryce.special.column.threadPool;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hufei
 * @date 2022/2/22 20:14
 * @description
 */
public class UserThreadFactory implements ThreadFactory {

    private final String namePrefix;
    private final AtomicInteger nextId = new AtomicInteger(1);

    public UserThreadFactory(String whatFeatureOfGroup) {
        this.namePrefix = "UserThreadFactory's"+whatFeatureOfGroup+"-worker-";
    }

    @Override
    public Thread newThread(Runnable task) {
        String name = namePrefix + nextId.getAndIncrement();
        Thread thread = new Thread(null,task,name,0);
        System.out.println(thread.getName());
        return thread;
    }
}
