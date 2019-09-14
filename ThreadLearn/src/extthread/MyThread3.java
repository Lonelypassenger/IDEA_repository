package extthread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:53 2019/9/6
 * @MODIFY:
 */
public class MyThread3 extends Thread {
    volatile private static int count;
    synchronized private static void addCount(){
        for(int i =0;i<100;i++){
            count++;
        }
        System.out.println("count = "+count);
    }
    public void run(){
        addCount();
    }
}
