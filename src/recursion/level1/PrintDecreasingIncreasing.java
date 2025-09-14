package recursion.level1;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    //in order to print the numbers in decreasing and increasing format
    public static void printDecreasingIncreasing(int number) {
        if(number == 0) return;

        //high level thinking
        System.out.println(number);
        printDecreasingIncreasing(number - 1);
        System.out.println(number);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        printDecreasingIncreasing(number);
    }
}
