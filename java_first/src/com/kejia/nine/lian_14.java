package com.kejia.nine;

public class lian_14 {
    static void j1(jiekou1 j){}
    public static void main(String args[]){

    }
}

interface jiekou1{
    void speak();
    void talk();
}

interface jiekou2{
    void get_on();
    void get_off();

}

interface jiekou3{
    void car();
    void flight();
}

interface jiekou4 extends jiekou1,jiekou2,jiekou3{
    void summery();
}
