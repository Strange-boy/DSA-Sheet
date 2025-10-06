package recursion.level1;

import java.util.Scanner;

public class AllIndexOccurence {
    //in order to find all index of array
    //time complexity : O(n)
    //space complexity : O(n) + O(space of index elements) (considered O(n))
    private static int[] allIndices(int[] nums, int target, int index, int foundSoFar) {
        //base case
        if (index == nums.length) {
            return new int[foundSoFar];
        }

        //high level thinking
        if (nums[index] == target) {
            int[] indexArray = allIndices(nums, target, index + 1, foundSoFar + 1);
            indexArray[foundSoFar] = index;
            return indexArray;
        } else {
            int[] indexArray = allIndices(nums, target, index + 1, foundSoFar);
            return indexArray;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        //enter the elements of array
        for (int idx = 0; idx < length; idx += 1) {
            nums[idx] = scn.nextInt();
        }

        int target = scn.nextInt();
        int[] indexArray = allIndices(nums, target, 0, 0);

        if (indexArray.length == 0) {
            System.out.println("No target element found");
            return;
        }

        System.out.println("index found at these positions");

        for(int index : indexArray) System.out.println("index found at" + index);
    }
}
