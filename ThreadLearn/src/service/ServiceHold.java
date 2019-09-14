package service;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:31 2019/9/8
 * @MODIFY:
 */
public class ServiceHold {
    private ReentrantLock lock = new ReentrantLock();
    public void testMethod1(){
        try{
            lock.lock();
            testMethod2();
            System.out.println("testMethod1 getHoldCount="+lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
    public void testMethod2(){
        try{
            lock.lock();
            System.out.println("testMethod2 getHoldCount="+lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
}
