package recursion.level1;

import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePaths {
    //time complexity : O(C(n+m - 2, n -1))
    // space complexity : O(n + m - 2 * C(n + m - 2, n -1 ))
    //in order to print all possible maze paths by travelling one step (horizontal or vertical)
    public static ArrayList<String> getMazePaths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {
        //base case
        if(sourceRow == destinationRow && sourceColumn == destinationColumn) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        //if we are standing last horizontal column, then traverse only vertical paths
        if(sourceColumn < destinationColumn) {
            hpaths = getMazePaths(sourceRow, sourceColumn + 1, destinationRow, destinationColumn);
        }

        //vice versa
        if(sourceRow < destinationRow) {
            vpaths = getMazePaths(sourceRow + 1, sourceColumn, destinationRow, destinationColumn);
        }

        ArrayList<String> paths = new ArrayList<>();

        //in order to get all horizontal paths
        for(String hpath: hpaths) {
            paths.add("h" + hpath);
        }

        for(String vpath: vpaths) {
            paths.add("v" + vpath);
        }

        return paths;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int destinationRow = scn.nextInt();
        int destinationColumn = scn.nextInt();

        ArrayList<String> paths = getMazePaths(1, 1, destinationRow, destinationColumn);
        System.out.println(paths);
    }
}
