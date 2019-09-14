package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:leetcode 第28题
 * @DATE:CRETED: IN 13:38 2019/9/13
 * @MODIFY:
 */
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if(needle==null)return 0;

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        strStr("hello","ll");
    }
}
