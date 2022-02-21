package com.bryce.book.core.theSecondChapter.two_two.setNewStringTwoLock;

/**
 * @author huff
 * @date 2020/3/18 16:57
 */


/**
 * 因为50毫秒后线程B取得的锁是"456"
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");;
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);  //存在50毫秒
        b.start();
    }
}
