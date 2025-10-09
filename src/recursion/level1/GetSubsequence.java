package recursion.level1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    //helper function to find all the subsequence
    //Time complexity : O(2^n)
    //Space complexity : O(2^n)
    private static ArrayList<String> getSubsequence(String str) {
        if(str.isEmpty()){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String remainingString = str.substring(1);

        ArrayList<String> recursionResult = getSubsequence(remainingString);
        ArrayList<String> mainResult = new ArrayList<>();

        //first add nothing
        for(String result : recursionResult) {
            mainResult.add("" + result);
        }

        //then add character
        for(String result : recursionResult) {
            mainResult.add(ch + result);
        }

        return mainResult;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList<String> subsequenceResult = getSubsequence(str);

        for(String result : subsequenceResult) {
            System.out.println(result);
        }
    }
}
