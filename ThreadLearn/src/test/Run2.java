package test;

import entity.Add;
import entity.Subtract;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:08 2019/9/7
 * @MODIFY:
 */
class ThreadAdd extends Thread{
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p=p;
    }
    public void run(){
        p.add();
    }
}

class ThreadSubtract extends Thread{
    private Subtract s;
    public ThreadSubtract(Subtract s){
        super();
        this.s=s;
    }
    public void run(){
        s.subtract();
    }
}

public class Run2 {
    public static void main(String[] args) {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("threadSubtract1");
        threadSubtract1.start();
        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("threadSubtract2");
        threadSubtract2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("threadAdd");
        threadAdd.start();
    }
}
