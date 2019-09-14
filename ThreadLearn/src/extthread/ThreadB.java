package extthread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:37 2019/9/7
 * @MODIFY:
 */
public class ThreadB extends Thread {
    synchronized public void run(){
        try {
            System.out.println("begin b thread： " + Thread.currentThread().getName() + " in :" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end b thread： " + Thread.currentThread().getName() + " in :" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
