package test;

import extthread.MyThread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 16:14 2019/9/8
 * @MODIFY:
 */
public class Run11 {
    public static void main(String[] args) {
        try {
            MyThread m = new MyThread();
            System.out.println("main方法中的状态1：" + m.getState());
            Thread.sleep(1000);
            m.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2：" + m.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
