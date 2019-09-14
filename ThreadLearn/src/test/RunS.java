package test;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:18 2019/9/8
 * @MODIFY:
 */
class ThreadSS extends Thread{
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}

public class RunS {
    public static void main(String[] args) {
        ThreadSS ss = new ThreadSS();
        ThreadSS ss1 = new ThreadSS();
        ThreadSS ss2 = new ThreadSS();
        ss.start();
        ss1.start();
        ss2.start();
    }
}
