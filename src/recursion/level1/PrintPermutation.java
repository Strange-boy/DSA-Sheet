package recursion.level1;

import java.util.Scanner;

public class PrintPermutation {
    //in order to print all the possible permutations with given string
    //Time complexity : O(n * n!)
    //Space complexity : O(n)
    private static void printPermutation(String question, String answerSoFar) {
        //base case
        if(question.isEmpty()) {
            System.out.println(answerSoFar);
            return;
        }

        for(int idx = 0; idx < question.length(); idx++ ) {
            char currChar = question.charAt(idx);
            String leftPart = question.substring(0, idx);
            String rightPart = question.substring(idx + 1);
            String remainingQuestion = leftPart + rightPart;

            printPermutation(remainingQuestion, answerSoFar + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String question = scn.next();

        printPermutation(question, "");
    }
}
