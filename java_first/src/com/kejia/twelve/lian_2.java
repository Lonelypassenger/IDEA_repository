package com.kejia.twelve;

class AutoMobile{
    String name = "Mobile";
    public void print(){
        System.out.println(this.name);
    }
}

class Nokia extends AutoMobile{
    String Mobile_name = "Nokia";
    public void print(){
        System.out.println(this.name + "   "+this.Mobile_name);
    }

    public void print_new(){
        System.out.println(this.Mobile_name);
    }
}

public class lian_2<T> {
    private T a;
    public lian_2(T a){this.a = a;}
    public T get(){return this.a;}
    public void set(T a){this.a = a;}


    public static void main(String args[]){
        lian_2<Nokia> holder = new lian_2<Nokia>(new Nokia());
        AutoMobile a3 = holder.get();
        a3.print();

    }
}
