package test;

import service.MyService;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:46 2019/9/8
 * @MODIFY:
 */

class MyThread extends Thread{
    private MyService m;
    public MyThread(MyService m){
        super();
        this.m = m;
    }

    public void run(){
        m.testMethod();
    }
}
public class Run7 {
    public static void main(String[] args) {

        MyThread a1 = new MyThread(new MyService());
        MyThread a2 = new MyThread(new MyService());
        MyThread a3 = new MyThread(new MyService());
        MyThread a4 = new MyThread(new MyService());
        MyThread a5 = new MyThread(new MyService());
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

    }
}
