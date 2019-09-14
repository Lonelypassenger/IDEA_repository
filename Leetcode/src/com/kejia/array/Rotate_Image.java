package com.kejia.array;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION: leetcode 第48题
 * 分析
 * 首先沿着对脚线翻转一次，然后在沿着水平方向翻转一次。
 * @DATE:CRETED: IN 10:31 2019/9/14
 * @MODIFY:
 */
public class Rotate_Image {
    public static void rotate(int[][] matrix) {
        //首先沿着主对角线翻转一次:
        int length = matrix[0].length;
        for(int i =0;i<length;i++ ){
            for(int j = i+1;j<length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //然后在左右翻转：
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-1-j];
                matrix[i][length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrx = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrx);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++)
            {
                System.out.print(matrx[i][j]);
            }
            System.out.println();
        }
    }
}
