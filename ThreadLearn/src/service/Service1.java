package service;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:22 2019/9/6
 * @MODIFY:
 */
public class Service1 {
    synchronized public static void printA(){
        try {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "in time : " + System.currentTimeMillis() + "get in method printA");
            Thread.sleep(3000);
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "in time : " + System.currentTimeMillis() + "get out method printA");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        try {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "in time : " + System.currentTimeMillis() + "get in method printB");
            Thread.sleep(3000);
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "in time : " + System.currentTimeMillis() + "get out method printB");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public static void printC(){
        try {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "in time : " + System.currentTimeMillis() + "get in method printC");
            Thread.sleep(3000);
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "in time : " + System.currentTimeMillis() + "get out method printC");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
