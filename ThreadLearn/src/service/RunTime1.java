package service;

import extthread.MyThread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:35 2019/9/8
 * @MODIFY:
 */
public class RunTime1 {
    private static Timer timer = new Timer();
    static public class MyTaskB extends TimerTask{

        @Override
        public void run() {
            System.out.println("B 运行了");
        }
    }
    static public class MyTaskA extends TimerTask {

        @Override
        public void run() {
            System.out.println("A 运行了");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        try {
            MyTaskA a = new MyTaskA();
            MyTaskB b = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-8-8 14:55:10";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间:" + new Date().toLocaleString());
            timer.schedule(a, dateRef,4000);
            timer.schedule(b, dateRef,4000);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
