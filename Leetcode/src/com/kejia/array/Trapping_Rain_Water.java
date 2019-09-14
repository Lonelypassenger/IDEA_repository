package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:难度困难 leetcode第42题：
 * 分析：
 *
 * @DATE:CRETED: IN 10:55 2019/9/13
 * @MODIFY:这道题在时间和空间复杂度上都可以继续进行优化。
 */
public class Trapping_Rain_Water {
    public static int trap(int[] height) {
        int water = 0;
        int max_r;
        int max_l;
        int water1 = 0;
        for(int i=1;i<height.length-1;i++){
            max_r = find_max(height,i+1,height.length);
            max_l = find_max(height,0,i);
            water1 = Math.min(max_l,max_r)-height[i];
            if(water1<0)water1=0;
            water+=water1;
        }

        return water;
    }

    public static int find_max(int[] height,int begin,int end){
        int max=height[begin];
        for(int i =begin;i<end;i++){
            if(max<height[i]){max = height[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }
}
