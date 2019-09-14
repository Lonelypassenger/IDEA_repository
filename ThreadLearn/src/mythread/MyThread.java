package mythread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:18 2019/9/5
 * @MODIFY:
 */
public class MyThread extends Thread {
    public void run(){
        try{
            for(int i=0;i<10;i++){
            int time = (int) (Math.random()*1000);
            Thread.sleep(time);
            System.out.println("run: "+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
