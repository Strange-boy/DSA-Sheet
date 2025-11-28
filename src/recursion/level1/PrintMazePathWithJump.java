package recursion.level1;

import java.util.Scanner;

public class PrintMazePathWithJump {

    //in order to print all the maze paths with jump
    private static void printMazePathWithJumps(int sourceRow, int sourceCol, int destinationRow, int destinationCol, String path) {
        if(sourceRow == destinationRow && sourceCol == destinationCol) {
            System.out.println(path);
            return;
        }

        //consider all the horizontal jumps
        for(int hmove = 1; hmove <= destinationCol - sourceCol; hmove += 1){
            printMazePathWithJumps(sourceRow, sourceCol + hmove, destinationRow, destinationCol,path + "h" + hmove);
        }

        //consider all the vertical jumps
        for(int vmove = 1; vmove <= destinationRow - sourceRow; vmove += 1){
            printMazePathWithJumps(sourceRow + vmove, sourceCol, destinationRow, destinationCol, path + "v" + vmove);
        }

        //consider all the diagonal moves
        for(int dmove = 1; dmove <= destinationRow - sourceRow && dmove <= destinationCol - sourceCol; dmove += 1){
            printMazePathWithJumps(sourceRow + dmove, sourceCol + dmove, destinationRow, destinationCol, path + "d" + dmove);
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int destinationRow = scn.nextInt();
        int destinationCol = scn.nextInt();

        printMazePathWithJumps(1, 1, destinationRow, destinationCol, "");
    }
}
