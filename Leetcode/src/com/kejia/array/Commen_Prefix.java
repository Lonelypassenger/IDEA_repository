package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:leetcode 第14题
 * @DATE:CRETED: IN 13:26 2019/9/13
 * @MODIFY:
 */
public class Commen_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1)return "";
        String result = "";
        for(int i = 0;i<strs[0].length();i++){

            for(int j = 1;j<strs.length;j++){
                if(strs[j].length()<=i){
                    return result;
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return result;
                }
            }
            result+=strs[0].charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "sfa";
        System.out.println(s.charAt(1));
    }
}
