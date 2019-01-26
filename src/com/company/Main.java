package com.company;

public class Main {

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{3,6,3};
        int target = 6;

        int[] result = twoSum.twoSum(nums,target);
        
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
