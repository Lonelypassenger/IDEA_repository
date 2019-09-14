package extthread;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:26 2019/9/5
 * @MODIFY:
 */
public class extTest extends Thread{
    private int i;
    public extTest(int i){
        this.i = i;
    }
    @Override
    public void run(){
        System.out.println("i = "+i);
    }
}
