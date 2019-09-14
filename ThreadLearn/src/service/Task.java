package service;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 8:58 2019/9/6
 * @MODIFY:
 */
public class Task {
    private String getData1;
    private String getData2;
    public void doLongTimeTask(){
        for(int i = 0;i<100;i++){
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+"i = "+(i+1));
        }
        System.out.println();
        synchronized (this){
            for(int i = 0;i<100;i++){
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+"i = "+(i+1));
            }
        }
    }
}
