package service;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:30 2019/9/6
 * @MODIFY:
 */
public class Service2 {
    public static void print(String stringParam){
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(3000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
