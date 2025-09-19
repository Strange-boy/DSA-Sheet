package recursion.level1;

import java.util.Scanner;

public class PrintFactorial {

    //recursive solution to print the factorial of a number
    //time complexity : O(N)
    // space : O(N)
    private static int factorial(int number) {
        //low level thinking
        if (number < 0) throw new IllegalArgumentException("Factorial not defined for negative numbers");
        if(number == 1 || number == 0) return 1;

        //high level thinking
        int fnm1 = factorial(number - 1);
        int fn = number * fnm1;
        return fn;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        int result = factorial(number);
        System.out.println("The Factorial of " + number + " : " + result);
    }
}
