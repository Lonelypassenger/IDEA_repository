package test;

import extthread.ThreadA;
import extthread.ThreadB;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:42 2019/9/7
 * @MODIFY:
 */
public class Run6 {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("main end "+System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
