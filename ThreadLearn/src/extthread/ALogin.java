package extthread;
import controller.LoginServlet;
/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:32 2019/9/5
 * @MODIFY:
 */
public class ALogin extends Thread {

    public void run(){
       LoginServlet.doPost("a","aa");
    }
}
