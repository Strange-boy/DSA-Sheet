package recursion.level1;

import java.util.Scanner;

public class TargetSumSubset {
    private static void findTargetSumSubsets(int[] nums, int currentIdx, String answerSoFar,int currentSum, int targetSum){
        if(currentIdx == nums.length && currentSum == targetSum){
            System.out.println(answerSoFar);
            return;
        } else if(currentIdx == nums.length) {
            return;
        }

        //at each step we have two option , either select the number of not select it
        findTargetSumSubsets(nums, currentIdx + 1, answerSoFar + nums[currentIdx] + " ",currentSum + nums[currentIdx], targetSum);
        findTargetSumSubsets(nums, currentIdx + 1, answerSoFar , currentSum, targetSum);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        //input the elements in the array
        for(int idx = 0; idx < nums.length; idx += 1){
            nums[idx] = scn.nextInt();
        }

        int targetSum = scn.nextInt();
        findTargetSumSubsets(nums, 0,"",0, targetSum);
    }
}
