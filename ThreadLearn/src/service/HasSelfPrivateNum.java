package service;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 16:33 2019/9/5
 * @MODIFY:
 */
public class HasSelfPrivateNum {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    synchronized public void addI(String username){
        try {
            if (username.equals("a")) {
                System.out.println("a set over");
                num = 100;
                Thread.sleep(2000);
            }
            else{
                System.out.println("b is set over");
                num=200;
            }
            System.out.println(username+"num is:"+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
