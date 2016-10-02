/**
167. Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
*/

public class TwoSumSort {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[]{-1, -1};
        if(nums == null || nums.length == 0){
            return result;
        }
        int start = 0, end = nums.length - 1;
        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                result[0] = start;
                result[1] = end;
                break;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}
