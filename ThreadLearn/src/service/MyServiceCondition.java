package service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:04 2019/9/8
 * @MODIFY:
 */
public class MyServiceCondition {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("从现在开始wait:"+System.currentTimeMillis());
            condition.await();
            System.out.println("从现在释放"+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        try {
            lock.lock();
            System.out.println("signal时间为：" + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
