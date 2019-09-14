package myservice;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:00 2019/9/5
 * @MODIFY:
 */
public class Main {
    public int i = 10;

    synchronized public void printMain(){
        try {
            i--;
            System.out.println("main_i = " + i);
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
