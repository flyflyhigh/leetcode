package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution.
	Example:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	*/
	public int[] twoSum(int[] nums, int target){
		int[] result = new int[]{-1, -1};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			int remain = target - nums[i];
			if(map.containsKey(remain)){
				result[0] = map.get(remain);
				result[1] = i;
				break;
			}
			map.put(nums[i],i);
		}
		return result;
	}
}
