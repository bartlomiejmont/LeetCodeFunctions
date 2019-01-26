package com.company;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        int st =0, nd=1;

        loops:
        while(true){
            while(nd!=nums.length){
                if((nums[st]+nums[nd])==target){
                    break loops;
                }
                nd++;
            }
            st++;
            nd=st+1;
        }
        result[0]=st;
        result[1]=nd;

        return result;
    }
}
