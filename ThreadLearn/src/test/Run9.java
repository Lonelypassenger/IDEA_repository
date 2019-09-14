package test;

import service.SeviceRR;

import java.io.StringReader;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:22 2019/9/8
 * @MODIFY:
 */
class ThreadRA extends Thread{
    private SeviceRR sr;
    ThreadRA(SeviceRR sr){
        super();
        this.sr = sr;
    }

    public void run(){
        sr.write();
    }
}
class ThreadRB extends Thread{
    private SeviceRR sr;
    ThreadRB(SeviceRR sr){
        super();
        this.sr = sr;
    }

    public void run(){
        sr.write();
    }
}

public class Run9 {
    public static void main(String[] args) {
        SeviceRR sr = new SeviceRR();
        ThreadRA ra = new ThreadRA(sr);
        ra.setName("a");
        ThreadRB rb = new ThreadRB(sr);
        rb.setName("b");
        ra.start();
        rb.start();
    }


}
