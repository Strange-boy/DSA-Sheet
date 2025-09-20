package recursion.level1;

import java.util.Scanner;

public class TowerOfHanoi {

    //in order to print the solution of Tower of Hanoi
    //Total moves = 2^n - 1
    //Time complexity : O(2^n)
    //space complexity : O(n)
    //Total moves : 2^(n - 1) + 1
    private static void towerOfHanoi(int disks, int source, int destination, int helper){
        if(disks == 0) return;;

        towerOfHanoi(disks - 1, source, helper, destination);
        System.out.println(disks + " [" + source + " -> " + destination + "]");
        towerOfHanoi(disks - 1, helper, destination, source);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int disks = scn.nextInt();

        int source = scn.nextInt();
        int destination = scn.nextInt();
        int helper = scn.nextInt();

        towerOfHanoi(disks, source, destination, helper);
    }
}
