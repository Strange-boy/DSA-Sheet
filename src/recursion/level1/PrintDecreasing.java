package recursion.level1;

import java.util.Scanner;

public class PrintDecreasing {
    private static void printDecreasing(int number) {
        //base case
        if(number == 0) return;

        //high level thinking
        System.out.println(number);
        printDecreasing(number - 1);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        printDecreasing(number);
    }
}
