package recursion.level1;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class GetStairPaths {

    //logic to find all possible stair paths using recursion
    // Time complexity : O(3^n)
    // Space complexity : O(n * 3^n)
    private static ArrayList<String> getStairPaths(int currentStair) {
        //base case
        if(currentStair == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        } else if(currentStair < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> paths1 = getStairPaths(currentStair - 1);
        ArrayList<String> paths2 = getStairPaths(currentStair - 2);
        ArrayList<String> paths3 = getStairPaths(currentStair - 3);

        ArrayList<String> possiblePaths = new ArrayList<>();

        //add all paths from paths1
        for(String path : paths1) {
            possiblePaths.add(1 + path);
        }

        //add all paths from paths2
        for(String path: paths2) {
            possiblePaths.add(2 + path);
        }

        //add all paths from paths3
        for(String path: paths3) {
            possiblePaths.add(3 + path);
        }

        return possiblePaths;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<String> stairPaths = getStairPaths(n);
        System.out.println(stairPaths);
    }
}
