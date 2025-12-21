package recursion.level1;

import java.util.Scanner;

public class NQueens {

    //in order to write all the safe places for queens that can be placed
    private static boolean isQueenSafe(int[][] chess, int row, int col){

        //first we need to check for the upper columns
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        //left upper diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        //right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }

        //if all conditions are satisfied then we can place the queen safely
        return true;
    }

    //in order to print all possible n queens
    private static void printNQueens(int[][] chess, String queenSoFar, int row){
        if(row == chess.length){
            System.out.println(queenSoFar);
            return;
        }

        for(int col = 0; col < chess.length; col += 1){
            if(isQueenSafe(chess, row, col)){
                chess[row][col] = 1;
                printNQueens(chess, queenSoFar + row + "-" + col + ", " , row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int boardSize = scn.nextInt();
        int chess[][] = new int[boardSize][boardSize];

        printNQueens(chess, "", 0);
    }
}
