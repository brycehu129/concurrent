package com.bryce.book.core.theSecondChapter.two_two.test3;

/**
 * @author huff
 * @date 2020/3/18 0:49
 */

import com.bryce.book.core.theSecondChapter.two_two.test2.MyObject;
import com.bryce.book.core.theSecondChapter.two_two.test2.Service;
import com.bryce.book.core.theSecondChapter.two_two.test2.ThreadA;
import com.bryce.book.core.theSecondChapter.two_two.test2.ThreadB;

/**
 * 验证：当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
