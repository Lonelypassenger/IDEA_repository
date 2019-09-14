package test;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:57 2019/9/7
 * @MODIFY:
 */
public class RunJoin {
    public static void main(String[] args) {
        System.out.println("main kaishi");
       Thread thread =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("线程结束");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        try {
            thread.join(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
