package extthread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:36 2019/9/7
 * @MODIFY:
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b = b;
    }
    public void run(){
        try{
            synchronized (b){
                System.out.println("begin a thread： " + Thread.currentThread().getName() + " in :" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end a thread： " + Thread.currentThread().getName() + " in :" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
