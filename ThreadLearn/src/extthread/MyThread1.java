package extthread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 16:10 2019/9/5
 * @MODIFY:
 */
class MyThread2 extends Thread{
    public void run(){
        System.out.println("thread2的优先级是：" + this.getPriority());
    }
}

public class MyThread1 extends Thread {
    public void run(){
        System.out.println("thread1的优先级是:" + this.getPriority());
        MyThread2 m2 = new MyThread2();
        m2.start();
    }
}
