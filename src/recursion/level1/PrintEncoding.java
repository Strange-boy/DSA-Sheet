package recursion.level1;
import java.util.Scanner;

public class PrintEncoding {

    //function to print all the possible encodings
    //Time complexity : O(2^n)
    //space complexity : O(n)
    private static void printEncodings(String question, String answerSoFar){
        //if the length of the question is 0
        if(question.isEmpty()){
            System.out.println(answerSoFar);
            return;
        } else if(question.length() == 1){
            //if the first character is '0', we have to simply return it
            char currChar = question.charAt(0);
            if(currChar == '0'){
                return;
            } else {
                int charValue = currChar - '0';
                char charCode = (char)('a' + charValue - 1);
                System.out.println(answerSoFar + charCode);
                return;
            }
        } else {
            //when we have 2 or more numbers

            //case 1 : pick first number
            char currChar = question.charAt(0);
            String remainingQuestion = question.substring(1);

            if(currChar == '0'){
                return;
            } else {
                int charValue = currChar - '0';
                char charCode = (char)('a' + charValue - 1);
                printEncodings(remainingQuestion, answerSoFar + charCode);
            }

            //case 2 when we have to two numbers
            String currChar12 = question.substring(0,2);
            String remainingQuestion12 = question.substring(2);

            int charValue12 = Integer.parseInt(currChar12);

            //only if it's less than or equal to 26 then i need to proceed
            if(charValue12 <= 26) {
                char charCode12 = (char)('a' + charValue12 - 1);
                printEncodings(remainingQuestion12, answerSoFar + charCode12);
            }
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String question = scn.next();

        printEncodings(question, "");
    }

}
