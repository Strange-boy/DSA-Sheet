package recursion.level1;

import java.util.Scanner;

public class PrintZigZag {
    //recursive function to print the zig zag
    //Time complexity : O(2^n)
    //Space complexity : O(n)
    private static void printZigZag(int number) {
        //base case
        if(number == 0) return;

        //two recursive calls + euclidean tree (crux)
        System.out.print(number + " "); // pre-call
        printZigZag(number - 1);
        System.out.print(number + " "); // in call
        printZigZag(number - 1);
        System.out.print(number + " "); // post call

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        printZigZag(number);
    }
}
