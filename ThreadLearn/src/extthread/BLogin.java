package extthread;

import controller.LoginServlet;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:33 2019/9/5
 * @MODIFY:
 */
public class BLogin extends Thread {
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
