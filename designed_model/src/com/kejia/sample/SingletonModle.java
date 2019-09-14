package com.kejia.sample;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:17 2019/9/3
 * @MODIFY:
 */
public class SingletonModle {
    public static void main(String[] args) {
        Singleton.getInstance().doSomething();
    }
}

class LockFreeSingleton{

}


class Singleton{
    public static Singleton instance;
    //将构造函数设置为private就可以是该对象实例智能在该类内部创建，从而保证了单例
    private Singleton(){
        System.out.println("Singleton has been Instantiated");
    }
    public static  Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }
    public void doSomething(){
        System.out.println("this is do something for this model");
    }
}
