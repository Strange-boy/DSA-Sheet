package recursion.level1;

import java.util.Scanner;

public class PrintIncreasing {

    public static void printIncreasing(int number){
        if(number == 0) return;

        //high level thinking
        printIncreasing(number - 1);
        System.out.println(number);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        printIncreasing(number);
    }
}
