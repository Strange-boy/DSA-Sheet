package recursion.level1;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePathsWithJump {
    //Time complexity : O(3 ^ (destinationRow + destinationCol))
    //in order to get the maze paths with jump
    public static ArrayList<String> getMazePathsWithJump(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        //base case
        if(sourceRow == destinationRow && sourceColumn == destinationColumn) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        ArrayList<String> paths = new ArrayList<>();

        //in order to get all the horizontal moves
        for(int hmove = 1; hmove <= destinationColumn - sourceColumn; hmove += 1){
            ArrayList<String> hpaths = getMazePathsWithJump(sourceRow, sourceColumn + hmove, destinationRow, destinationColumn);

            //add the horizontal moves to the result
            for(String hpath : hpaths) {
                paths.add("h" + hmove + hpath);
            }
        }

        //in order to get all the vertical moves
        for(int vmove = 1; vmove <= destinationRow - sourceRow; vmove += 1){
            ArrayList<String> vpaths = getMazePathsWithJump(sourceRow + vmove, sourceColumn, destinationRow, destinationColumn);

            //add the vertical moves to the result
            for(String vpath : vpaths) {
                paths.add("v" + vmove + vpath);
            }
        }

        //in order to track all the diagonal moves
        for(int dmove = 1; dmove <= destinationColumn - sourceColumn && dmove <= destinationRow - sourceRow; dmove += 1){
            ArrayList<String> dpaths = getMazePathsWithJump(sourceRow + dmove, sourceColumn + dmove, destinationRow, destinationColumn);

            //add the diagonal moves the maze jumps
            for(String dpath : dpaths) {
                paths.add("d" + dmove + dpath);
            }
        }

        return paths;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int destinationRow = scn.nextInt();
        int destinationColumn = scn.nextInt();

        ArrayList<String> paths = getMazePathsWithJump(1, 1, destinationRow, destinationColumn);
        System.out.println(paths);
    }

}
