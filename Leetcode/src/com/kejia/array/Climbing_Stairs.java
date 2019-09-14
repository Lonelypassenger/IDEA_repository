package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:70
 * 分析：
 * 其实最后的结果就是一个斐波那契数列的结果，
 * 如果采用递归地方法那么会产生很高的时间复杂度，所以这里我们采用迭代的方式来解决问题。也可以直接使用数学公司
 * @DATE:CRETED: IN 11:08 2019/9/14
 * @MODIFY:
 */
public class Climbing_Stairs {
    public int climbStairs(int n) {
        //首先定义出来0，和-1 的
        int prev = 0;
        int cur = 1;
        for(int i=1;i<n;i++){
            int temp = cur+prev;
            prev = cur;
            cur = temp;
        }
        return cur;
    }
}
