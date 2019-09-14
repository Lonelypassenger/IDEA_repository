package myservice;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:02 2019/9/5
 * @MODIFY:
 */
public class subMain extends Main {
    synchronized  public void subOperator(){
        try{
            i--;
            System.out.println("subMain_i = "+i);
            Thread.sleep(200);
            this.printMain();
        }catch(InterruptedException e){e.printStackTrace();}
    }
}
