package service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:43 2019/9/8
 * @MODIFY:
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i = 0;i<5;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}
