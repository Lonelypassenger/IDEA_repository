package test;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:51 2019/9/6
 * @MODIFY:
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized (this){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+ " i = "+(i+1));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        synchronized public void method2(){
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" i = "+(i+1));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
