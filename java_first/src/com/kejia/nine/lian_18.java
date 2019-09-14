package com.kejia.nine;

public class lian_18 {
    public static void main(String args[]){
        Factor1 f1 =new Factor1();
        Factor2 f2 =new Factor2();
        Factor3 f3 =new Factor3();
        f1.get_cycle().method1();
        f1.get_cycle().method2();
        f2.get_cycle().method1();
        f2.get_cycle().method2();
        f3.get_cycle().method1();
        f3.get_cycle().method2();
    }
}


interface Cycle{
    void method1();
    void method2();
}
interface Cycle_factory{
    Cycle get_cycle();
}
class Unicycle implements Cycle{
    @Override
    public void method1(){
        System.out.println("this is Uicycle method1");
    }

    @Override
    public void method2() {
        System.out.println("this is Uicycle method2");
    }
}
class Bicycle implements Cycle{

    @Override
    public void method1() {
        System.out.println("this is Bicycle method1");
    }

    @Override
    public void method2() {
        System.out.println("this is Bicycle method2");
    }
}

class Tricycle implements Cycle{

    @Override
    public void method1() {
        System.out.println("this is Tricycle method1");
    }

    @Override
    public void method2() {
        System.out.println("this is Tricycle method2");
    }
}

class Factor1 implements Cycle_factory{

    @Override
    public Cycle get_cycle() {
        return new Unicycle();
    }
}
class Factor2 implements Cycle_factory{

    @Override
    public Cycle get_cycle() {
        return new Bicycle();
    }
}
class Factor3 implements Cycle_factory{

    @Override
    public Cycle get_cycle() {
        return new Tricycle();
    }
}