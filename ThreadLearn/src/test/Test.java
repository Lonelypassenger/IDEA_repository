package test;
import mylist.MyList;
import mythread.MyThread;
import extthread.extTest;
import myrunable.MyRunable;
/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:13 2019/9/5
 * @MODIFY:
 */
class ThreadAA extends Thread{
    private Object lock;
    public ThreadAA(Object lock){
        super();
        this.lock= lock;
    }
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    System.out.println("这是第" + (i + 1) + "个加入的");
                    if(i == 5){
                        lock.notify();
                        lock.wait();
                    }
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadBB extends Thread{
    private Object lock;
    public ThreadBB(Object lock){
        super();
        this.lock= lock;
    }
    public void run(){
        try {
            synchronized (lock){
                System.out.println("b开始等待");
                lock.wait();
                System.out.println("==5了，b结束等待，并且退出");
                lock.notify();

                throw new InterruptedException();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadBB bb= new ThreadBB(lock);
        bb.setName("b");
        bb.start();
        ThreadAA aa = new ThreadAA(lock);
        aa.setName("a");
        aa.start();

    }
}
