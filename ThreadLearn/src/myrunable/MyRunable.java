package myrunable;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:32 2019/9/5
 * @MODIFY:
 */
public class MyRunable implements Runnable{

    @Override
    public void run() {
        System.out.println("this is a thread with runable");
    }
}
