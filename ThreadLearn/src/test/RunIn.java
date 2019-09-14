package test;

import java.util.Date;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:05 2019/9/7
 * @MODIFY:
 */
class InheritableThreadLocalExt extends InheritableThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "我在子线程加的";
    }
}

class Tools{
    public static InheritableThreadLocalExt t1 = new InheritableThreadLocalExt();
}

class ThreadA1 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("在线程A中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class RunIn {
    public static void main(String[] args) {
        try{
            for (int i=0;i<10;i++){
                System.out.println("在main线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA1 a =new ThreadA1();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
