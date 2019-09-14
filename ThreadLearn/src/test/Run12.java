package test;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 16:38 2019/9/8
 * @MODIFY:
 */
public class Run12 {
    public static void main(String[] args) {
        System.out.println("线程："+Thread.currentThread().getName()+"所在线程组的名字是:"+Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程组的父线程组是："+Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
