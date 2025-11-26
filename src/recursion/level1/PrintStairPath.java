package recursion.level1;

import java.util.Scanner;

public class PrintStairPath {
    //in order to print stair path
    //time complexity : O(3^n)
    //space complexity : O(n)
    private static void printStairPath(int currentStair, String path) {
        //base case
        if(currentStair == 0) {
            System.out.println(path);
            return;
        } else if(currentStair < 0) {
            return;
        }

        printStairPath(currentStair - 1, path + "1");
        printStairPath(currentStair - 2, path + "2");
        printStairPath(currentStair - 3, path + "3");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int stair = scn.nextInt();

        printStairPath(stair, "");
    }
}
