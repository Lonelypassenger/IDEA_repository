package com.kejia.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:23 2019/9/13
 * @MODIFY:
 */
public class Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            for(int j = 0;j<9;j++){
                Map<Character,Integer> mapc = new HashMap<Character,Integer>();
                Map<Character,Integer> mapr = new HashMap<Character,Integer>();
                if(board[i][j]!=','){
                    if(mapc.containsKey(board[i][j])){
                        return false;
                    }else mapc.put(board[i][j],1);
                }

                if(board[j][i]!=','){
                    if(mapc.containsKey(board[j][i])){
                        return false;
                    }else mapc.put(board[j][i],1);
                }

            }
        }

        for(int i = 0;i<9;i+=3){
            for(int j = 0;j<9;j+=3){
                Map<Character,Integer> mapc = new HashMap<Character,Integer>();
                for(int x =i;x<i+3;x++ ){
                    for(int y = j;y<j+3;y++){
                        if(board[x][y]!=',') {
                            if (mapc.containsKey(board[x][y])) {
                                return false;
                            } else mapc.put(board[x][y], 1);
                        }
                    }
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {

    }
}
