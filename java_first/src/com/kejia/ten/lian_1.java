package com.kejia.ten;

public class lian_1 {
    public static void main(String args[]){
        Outer i = new Outer();
        Outer.Inner inner = i.get_inner();
        inner.print_info();

    }
}

class Outer{
    class Inner{
        private int i =1;
        void print_info(){
            System.out.println("this is inner");
        }
    }

    public Inner get_inner(){
        return new Inner();

    }

}
