package com.kejia.eight;

public class lian10 {

    public static void main(String args[]){
        Alphabet a = new First();
        a.print_info();
    }
}

class Alphabet{
    public void print_info(){
       System.out.println(info());
    }
    public String info(){
        return "this is Alphabet_info";
    }
}

class First extends Alphabet{
    @Override
    public String info(){
        return "this is First_info";
    }
}
