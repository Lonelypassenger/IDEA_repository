package extobject;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 18:46 2019/9/5
 * @MODIFY:
 */
public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("this is A begin");
            Thread.sleep(2000);
            System.out.println("this is  A end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        System.out.println("this is B begin");
        System.out.println("this is B end");
    }

}
