package recursion.level1;

import java.util.Scanner;

public class PrintMazePath {

    private static void printMazePath(int sourceRow, int sourceCol, int destinationRow, int destinationCol, String path) {
        if(sourceRow == destinationRow && sourceCol == destinationCol) {
            System.out.println(path);
            return;
        }

        //move horizontally
        if(sourceCol < destinationCol) {
            printMazePath(sourceRow, sourceCol + 1, destinationRow, destinationCol, path + "h");
        }

        //move vertically
        if(sourceRow < destinationRow) {
            printMazePath(sourceRow + 1, sourceCol, destinationRow, destinationCol, path + "v");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int destinationRow = scn.nextInt();
        int destinationCol = scn.nextInt();

        printMazePath(1, 1, destinationRow, destinationCol, "");
    }
}
