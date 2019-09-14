package com.kejia.twelve;



public class lian_1 {
    static void f() throws Exception{
        System.out.println("this is in f()");
        throw new Exception("its a test");
    }
    public static void main(String[] a){
        try {
            f();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("the programe is really here");
        }
    }
}
