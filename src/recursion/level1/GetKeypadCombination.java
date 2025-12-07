package recursion.level1;

import java.util.Scanner;
import java.util.ArrayList;

public class GetKeypadCombination {

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    //in order to fetch all possible keypad combination
    //time complexity : O(n * k ^n)
    //space complexity : O(n * k ^n)
    private static ArrayList<String> getKeypadCombination(String str){
        if(str.isEmpty()){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        //consider 678
        char currChar = str.charAt(0); //6
        String remainingString = str.substring(1); //78

        ArrayList<String> recursionResult = getKeypadCombination(remainingString);
        ArrayList<String> myResult = new ArrayList<>();

        //iterate the current char to all the existing result
        String currentKey = codes[currChar - '0']; // pqrs

        for(int idx = 0; idx < currentKey.length(); idx += 1){
            char keyChar = currentKey.charAt(idx); // p , q , r , s

            //append to the result obtained from recursion
            for(String currentResult: recursionResult){
                myResult.add(keyChar + currentResult);
            }
        }

        return myResult;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList<String> words = getKeypadCombination(str);
        System.out.println(words);
    }
}
