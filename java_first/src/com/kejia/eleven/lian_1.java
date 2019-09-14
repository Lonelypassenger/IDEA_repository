package com.kejia.eleven;


import java.util.*;

public class lian_1 {
    public static Collection<String> fill(Collection<String> c){
        movieGenerater m = new movieGenerater();
        for (int j=0;j<10;j++){
            c.add(m.next());
        }
        return c;
    }

    public static void main(String args[]){
        Collection<String> arrayList = fill(new ArrayList<String>());
        Collection<String> linkedlist = fill(new LinkedList<String>());
        Collection<String> hashset = fill(new HashSet<String>());
        Collection<String> Linkedhashset =fill(new LinkedHashSet<String>()) ;
        System.out.println(arrayList);
        System.out.println(linkedlist);
        System.out.println(hashset);
        System.out.println(Linkedhashset);

    }
}
interface Generator<T>{
    public T next();
}

class movieGenerater implements Generator<String> {
    static int i = 0;
    private String[] movie = {"aaa","bbb","ccc","ddd"};
    @Override
    public String next() {
        String s = movie[i];
        i++;
        i =i%4;
        return s;
    }
}