package recursion.level1;

import java.util.Scanner;

//time complexity : O(2n)
//Space complexity : O(n)
public class LastIndexOccurence {
    private static int findLastIndex(int[] nums, int index, int target) {
        if(index == nums.length) return -1;

        //high level thinking
        int lastIndexFromRest = findLastIndex(nums, index + 1, target);

        if(lastIndexFromRest == -1 && nums[index] == target) {
            return index;
        } else {
            return lastIndexFromRest;
        }
    }

    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        int length = scn.nextInt();

        int[] nums = new int[length];

        //enter the input
        for(int idx = 0; idx < length; idx += 1) {
            nums[idx] = scn.nextInt();
        }

        int target = scn.nextInt();

        int lastIndex = findLastIndex(nums, 0 , target);
        System.out.println("The Last index : " + lastIndex);
    }
}
