package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:leetcode 第7题
 * @DATE:CRETED: IN 13:05 2019/9/13
 * @MODIFY:
 */
public class Integer_Reverse {
    public static int reverse(int x) {
        String s = String.valueOf(x);
        //System.out.println(s);
        char[] num = s.toCharArray();

        int begin = 0;
        if(num[0]=='-'){
            begin = 1;
        }
        for(int i = begin;i<(s.length()+begin)/2;i++){
            char temp = num[i];
            num[i] = num[s.length()-i-1+begin];
            num[s.length()-i-1+begin] = temp;
        }
        String n = new String(num);
        int result ;
        //System.out.println(num);
        try {
            result = Integer.parseInt(n);
        }catch (NumberFormatException e){
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 1534236469;

        System.out.println(reverse(x));
    }
}
