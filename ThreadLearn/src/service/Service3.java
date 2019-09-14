package service;

import user.UserInfo;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:31 2019/9/6
 * @MODIFY:
 */
public class Service3 {
    UserInfo userInfo = new UserInfo("aaa",123);
    public void testMethod(){
        try {
            synchronized (userInfo) {
                userInfo= new UserInfo("bbb",222);
                System.out.println(Thread.currentThread().getName() + "进入了");

                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "离开了");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
