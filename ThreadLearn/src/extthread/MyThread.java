package extthread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:47 2019/9/5
 * @MODIFY:
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造器中的状态："+Thread.currentThread().getState());
    }
    public void run(){
        System.out.println("run方法中的状态"+Thread.currentThread().getState());
    }
}
