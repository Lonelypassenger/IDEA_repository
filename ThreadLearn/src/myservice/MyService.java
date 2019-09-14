package myservice;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:19 2019/9/6
 * @MODIFY:
 */
public class MyService {
    private String lock = "123";
    public void testMethod(){
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
