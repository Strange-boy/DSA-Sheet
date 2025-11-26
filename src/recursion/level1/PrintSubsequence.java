package recursion.level1;

import java.util.Scanner;

public class PrintSubsequence {
    //in order to print all the subsequence
    //time complexity : O(2^n)
    //space complexity : O(n)
    private static void printSubsequence(String currString, String answer) {
        //base case
        if(currString.isEmpty()) {
            System.out.println(answer);
            return;
        }

        char ch = currString.charAt(0);
        String remainingString = currString.substring(1);

        printSubsequence(remainingString, answer + " ");
        printSubsequence(remainingString, answer + ch);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String currString = scn.next();

        printSubsequence(currString, "");
    }
}
