package com.kejia.twelve;

public class LiftOff {
    public static void main(String[] args) {
        Thread ot = new Thread(new OtherThread());
        ot.start();
        System.out.println("waiting for return");
    }
}

class OtherThread implements Runnable{
    private int countDown = 10;
    private static int task_count = 0;
    private final int id = task_count++;
    public OtherThread(){}
    public OtherThread(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"ListOff!")+")";
    }

    @Override
    public void run() {
        while(countDown-- > 0){
            System.out.println(status());
            //Thread.yield();
        }
    }
}
