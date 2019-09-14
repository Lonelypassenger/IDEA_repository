package com.kejia.array;

import java.util.*;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 8:39 2019/9/12
 * @MODIFY:
 */
public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length<2) return nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }

        Set<Integer> set = map.keySet();
        Iterator it = set.iterator();
        int max = 1;
        int cur = 1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey());

        }
       /* int pre = (int)it.next();
        System.out.println(pre);
        while(it.hasNext()){
            int j = (int)it.next();
            System.out.println(j);
            if(pre+1==j){
                cur++;
            }
            pre = j;
            if(max<cur) max = cur;
        }*/
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
