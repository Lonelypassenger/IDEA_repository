package service;

import myservice.Main;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 8:30 2019/9/6
 * @MODIFY:
 */
public class Service {
    synchronized public void testMethod(){
        if(Thread.currentThread().getName()=="a"){
            System.out.println("ThreadName = " + Thread.currentThread().getName()+" begin run time = " + System.currentTimeMillis());
            int i = 1;
            while(i == 1){
                if((""+ Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName = " + Thread.currentThread().getName()+" begin exception time = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }
        else{
            System.out.println("Thread B runtime = "+System.currentTimeMillis());
        }

    }
}
