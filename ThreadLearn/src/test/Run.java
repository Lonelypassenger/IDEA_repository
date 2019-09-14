package test;

import extobject.MyObject;
import extthread.ALogin;
import extthread.BLogin;
import extthread.MyThread;
import extthread.MyThread1;
import myservice.MyService;
import service.*;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:34 2019/9/5
 * @MODIFY:
 */
class ThreadA extends Thread{
    private Object lock;
    ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    public void run(){
        Service4 service4 = new Service4();
        service4.testMethod(lock);
    }
}
class ThreadB extends Thread{
    private Object lock;
    ThreadB(Object lock){
        super();
        this.lock = lock;
    }

    public void run(){
        Service4 service4 = new Service4();
        service4.synNotifyMethod(lock);
    }
}
class ThreadC extends Thread{
    private Service1 o;
    ThreadC(Service1 h){
        super();
        this.o = h;
    }

    public void run(){
        o.printC();
    }
}
public class Run {
    public static void main(String[] args) {
        Service3 ms = new Service3();
        ThreadA a = new ThreadA(ms);
        a.setName("a");
        ThreadB b = new ThreadB(ms);
        b.setName("b");
        a.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();

    }
}
