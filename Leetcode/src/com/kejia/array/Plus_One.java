package com.kejia.array;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:66
 * @DATE:CRETED: IN 10:47 2019/9/14
 * @MODIFY:
 */
public class Plus_One {
    public static int[] plusOne(int[] digits) {
        int sum=1;
        int l = digits.length;
        for(int i = l-1;i>=0;i--){
            sum = sum+digits[i];
            digits[i] = sum%10;
            sum = sum/10;
        }
        if(sum>0){
            int[] result = new int[l+1];
            result[0] = 1;
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8,9,9,9,9};
        int[] result = plusOne(nums);
        for(int i:result){
            System.out.print(i);
        }
    }
}
