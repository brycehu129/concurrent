package com.bryce.book.core.theSecondChapter.two_two.t9;

/**
 * @author huff
 * @date 2020/3/18 0:18
 */

/**
 * 因为list参数对象在这里是一个实例变量，在这里用synchronized关键字进行同步调用，即可解决脏读情况
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
            /*synchronized (list){*/
                if (list.getSize()<1){
                    Thread.sleep(2000); //模拟从远程花费2秒取回数据
                    list.add(data);
                }
            /*}*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
