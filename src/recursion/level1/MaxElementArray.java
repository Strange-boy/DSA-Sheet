package recursion.level1;

import java.util.Scanner;

public class MaxElementArray {

    // in order to find the max element of array
    //Time complexity : O(n)
    //Space complexity : O(n)
    private static int maxElement(int[] nums, int index) {
        //base case
        if(index == nums.length - 1) {
            return nums[index];
        }

        //high level thinking
        int misa = maxElement(nums, index + 1);

        if(misa > nums[index]) return misa;
        else return nums[index];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        for(int idx = 0; idx < length; idx += 1){
            nums[idx] = scn.nextInt();
        }

        int maxElement = maxElement(nums, 0);
        System.out.println("The Max element : " + maxElement);
    }
}
