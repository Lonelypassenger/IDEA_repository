package com.kejia.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class lian_2 {
    public static void main(String[] args){
        List<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> i = arraylist.iterator();
        while(i.hasNext()){
            int t = i.next();
            System.out.println(t);
        }
        System.out.println();
        for(int t:arraylist){
            System.out.println(t);
        }
    }
}
