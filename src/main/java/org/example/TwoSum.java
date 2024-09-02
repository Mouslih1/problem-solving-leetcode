package org.example;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(TwoSum.twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int[] items = new int[2];
        for (int i = 0; i < nums.length; i ++)
        {
            for(int j = 0 ; j < i; j ++)
            {
                if(nums[i] + nums[j] == target)
                {
                    items[0] = i;
                    items[1] = j;
                }
            }
        }

        return items;
    }
}
