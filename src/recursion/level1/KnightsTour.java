package recursion.level1;

import java.util.Scanner;

public class KnightsTour {
    //in order to display the chess board after the knights have been placed
    private static void displayChessBoard(int[][] chess){
        //traverse through the elements and display the current config of chess board
        for(int row = 0; row < chess.length; row += 1){
            for(int col = 0; col < chess[0].length; col += 1){
                System.out.print(chess[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //represents all the scnearios where knight cannot placed
    private static boolean isValidMove(int[][] chess, int row, int col){
        if(row < 0 || row >= chess.length || col < 0 || col >= chess.length){
            return false;
        }

        return chess[row][col] == 0;
    }

    //function to responsible for printing the knight's tour logic
    //Time complexity : O(8 ^ n^2)
    //Space complexity : O(N^2)
    private static void printKnightsTour(int[][] chess, int row, int col, int move){
        //false base case
        if(!isValidMove(chess, row, col)){
            return;
        } else if(move == chess.length * chess.length){
            chess[row][col] = move;
            displayChessBoard(chess);
            chess[row][col] = 0;
            return;
        }


        chess[row][col] = move;
        //we are going to go clockwise
        //right side
        printKnightsTour(chess, row - 2, col + 1, move + 1);
        printKnightsTour(chess, row - 1, col + 2, move + 1);
        printKnightsTour(chess, row + 1, col + 2, move + 1);
        printKnightsTour(chess, row + 2, col + 1, move + 1);
        //left side
        printKnightsTour(chess, row + 2, col - 1, move + 1);
        printKnightsTour(chess, row + 1, col - 2, move + 1);
        printKnightsTour(chess, row - 1, col - 2, move + 1);
        printKnightsTour(chess, row - 2, col - 1, move + 1);
        chess[row][col] = 0;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        int row = scn.nextInt();
        int col = scn.nextInt();

        printKnightsTour(chess, row, col , 1);
    }
}
