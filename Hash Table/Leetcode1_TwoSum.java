// Given an array of integers nums and an integer target, return indices 
// of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.
// You can return the answer in any order.

import java.util.HashMap;

public class Leetcode1_TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target - nums[i])){
                result[0] = hash.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            
            hash.put(nums[i], i);
        }
        
        return result;
    }
}