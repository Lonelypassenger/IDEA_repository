package service;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:27 2019/9/7
 * @MODIFY:
 */
public class Service4 {
    public void testMethod(Object lock){
        try {
            System.out.println("begin wait ThreadName =" + Thread.currentThread().getName());
            lock.wait();
            System.out.println("end wait ThreadName =" + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){
        try {
            synchronized (lock) {
                System.out.println("begin notify() ThreadName=" + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify() ThreadName=" + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
