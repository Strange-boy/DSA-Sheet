package recursion.level1;

import java.util.Scanner;

public class DisplayArray {

    //in order to display the elements of arrays
    //Time complexity : O(n)
    //space complexity : O(n)
    private static void displayArray(int[] nums, int index) {
        //low level thinking
        if(index == nums.length) return;

        //high level thinking
        System.out.println(nums[index]);
        displayArray(nums, index + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        for(int idx = 0; idx < length; idx += 1){
            nums[idx] = scn.nextInt();
        }

        displayArray(nums, 0);
    }
}
