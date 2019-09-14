package test;
import myservice.*;
/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:04 2019/9/5
 * @MODIFY:
 */
class ThreadS extends Thread{
    private subMain s;
    ThreadS(subMain s){
        this.s = s;
    }
    public void run(){
        s.subOperator();
    }
}
public class RunService {
    public static void main(String[] args) {
        subMain submain = new subMain();
        ThreadS s = new ThreadS(submain);
        s.start();
    }
}
