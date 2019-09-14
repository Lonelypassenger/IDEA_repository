package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 20:16 2019/9/11
 * @MODIFY:
 */
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0){
            if(nums1.length==0)
                return zhognweishu(nums2,0,nums2.length-1);
            else return zhognweishu(nums1,0,nums1.length-1);
        }
        int first1=0;int last1 = nums1.length-1;
        int first2 = 0;int last2 = nums2.length-1;
        while(first1<last1||first2<last2){
            double z1 = zhognweishu(nums1,first1,last1);
            double z2 = zhognweishu(nums2,first2,last2);
            //System.out.println(z2);
            if(z1>z2){
                last1 = (first1+last1)/2;
                if(first2<last2)
                first2= (first2+last2)/2+1;
            }
            else if(z2>z1){
                if(first1<last1)
                first1 = (first1+last1)/2+1;
                last2= (first2+last2)/2;
            }
            else{
                return z1;
            }
        }
        if((nums1.length+nums2.length)%2 == 0){
            return (double)(nums1[first1]+nums2[first2])/2;
        }
        return (nums1[first1]<nums2[first2])?nums1[first1]:nums2[first2];
    }
    public static double zhognweishu(int[] nums,int first,int last){
        if((last-first)%2==0) return nums[(first+last)/2];
        else return ((double)(nums[(first+last)/2]+nums[(first+last)/2+1])/2);
    }
}
public class Test {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
       System.out.println(Solution.findMedianSortedArrays(nums1,nums2));
    }
}
