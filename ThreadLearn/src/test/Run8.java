package test;

import service.MyServiceCondition;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:06 2019/9/8
 * @MODIFY:
 */
class ThreadCondition extends Thread{
    private MyServiceCondition serviceCondition;
    public ThreadCondition(MyServiceCondition serviceCondition){
        super();
        this.serviceCondition = serviceCondition;
    }
    public void run(){
        serviceCondition.await();
    }
}

public class Run8 {
    public static void main(String[] args) {
        MyServiceCondition serviceCondition =new MyServiceCondition();
        ThreadCondition threadCondition = new ThreadCondition(serviceCondition);
        threadCondition.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        serviceCondition.signal();
    }
}
