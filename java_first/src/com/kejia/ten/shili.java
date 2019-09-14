package com.kejia.ten;
class withiner{
    class inner{
        public void print(){
            System.out.println("this is inner");
        }
    }
}

public class shili extends withiner.inner{
    shili(withiner w){
        w.super();
    }
    public static void main(String args[]){
        withiner w = new withiner();
        shili s = new shili(w);
        s.print();
    }
}
