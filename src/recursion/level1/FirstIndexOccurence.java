package recursion.level1;

import java.util.Scanner;

public class FirstIndexOccurence {
    private static int firstIndex(int[] nums, int target, int index) {
        //base case
        if (index == nums.length) return -1;

        //high level thinking
        if (nums[index] == target) {
            return index;
        }

        return firstIndex(nums, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        //input array elements
        for (int idx = 0; idx < length; idx += 1) {
            nums[idx] = scn.nextInt();
        }

        int target = scn.nextInt();

        //in order to find the first index
        int firstIndex = firstIndex(nums, target, 0);
        System.out.println("First index in array :" + firstIndex);
    }
}
