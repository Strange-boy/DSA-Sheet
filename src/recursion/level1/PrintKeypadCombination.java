package recursion.level1;

import java.util.Scanner;

public class PrintKeypadCombination {

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    //in order to print all possible keypad combinations
    // time complexity : O(n x k^n)
    // space complexity : O(n)
    private static void printKeypadCombination(String str, String answerSoFar) {
        if(str.isEmpty()){
            System.out.println(answerSoFar);
            return;
        }

        char currentChar = str.charAt(0);
        String remainingString = str.substring(1);

        String keyString = codes[currentChar - '0'];

        for(int idx = 0; idx < keyString.length(); idx += 1){
            char keyCharSelected = keyString.charAt(idx);
            printKeypadCombination(remainingString, answerSoFar + keyCharSelected);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        printKeypadCombination(str, "");
    }
}
