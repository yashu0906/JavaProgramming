package com.company;

import java.util.Arrays;
import java.util.HashMap;

/*
* Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */
public class TwoSum_HashMap {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++){
           map.put(nums[i], i);
       }
       for(int i=0; i<nums.length; i++){
           if(map.containsKey(target-nums[i])){
               return new int[]{i, map.get(target-nums[i])};
           }
       }
       return new int[]{};
    }
    public static void main(String[] Args){
        TwoSum sum = new TwoSum();
        System.out.println(Arrays.toString(sum.twoSum(new int[]{3, 4, 7, 9}, 11)));

    }
}
