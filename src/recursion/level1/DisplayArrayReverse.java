package recursion.level1;

import java.util.Scanner;

public class DisplayArrayReverse {

    //in order to write a recursive solution to display the array in reverse manner
    //time complexity : O(n)
    // space complexity : O(n)
    private static void displayArrayReverse(int[] nums, int index) {
        if(index == nums.length) return;

        //low level thinking
        displayArrayReverse(nums, index + 1);
        System.out.println(nums[index]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        for(int idx = 0; idx < length; idx += 1){
            nums[idx] = scn.nextInt();
        }

        displayArrayReverse(nums, 0);
    }
}
