package test;

import extthread.MyThread;
import extthread.MyThread3;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:48 2019/9/5
 * @MODIFY:
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread3[] myThread3s = new MyThread3[100];
        for(int i=0;i<100;i++){
            myThread3s[i] = new MyThread3();
        }
        for(int j = 0;j<100;j++){
            myThread3s[j].start();
        }
    }
}
