package com.kejia.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:leetcode第3题
 * @DATE:CRETED: IN 11:57 2019/9/13
 * @MODIFY:
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

        if(s.length()<=1) return s.length();

        char[] chars = s.toCharArray();


        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int length = 0;
        int cur = 0;
        int pre_index = 0;
        for(int i = 0;i<s.length();i++){

            if(map.containsKey(chars[i])&&map.get(chars[i])>=pre_index){
                pre_index = map.get(chars[i])+1;
                map.remove(chars[i]);
                map.put(chars[i],i);
                //System.out.println(cur);
                if(length<cur) length =cur;
                cur = 0;


            } else{
                map.put(chars[i],i);

                cur = i-pre_index+1;
                // System.out.println(cur);
                //System.out.println(i);
                if(length<cur) length =cur;

            }
        }
        if(length<cur) length =cur;
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
