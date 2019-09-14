package com.kejia.eight;

public class Lian1 {
    public static void ride(Cycle a){
        a.print_info();
    }
    public static void main(String args[]){
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}

class Cycle{
    void print_info(){
        System.out.println("this is form Cycle");
    }
}

class Unicycle extends Cycle{
    void print_info(){
        System.out.println("this is form Unicycle");
    }
}

class Bicycle extends Cycle{
    void print_info(){
        System.out.println("this is form Bicycle");
    }
}
class Tricycle extends Cycle{
    void print_info(){
        System.out.println("this is form Tricycle");
    }
}
