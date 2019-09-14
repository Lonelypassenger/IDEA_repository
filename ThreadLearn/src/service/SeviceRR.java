package service;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:19 2019/9/8
 * @MODIFY:
 */
public class SeviceRR {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void write(){
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
