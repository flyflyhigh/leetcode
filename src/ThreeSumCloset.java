import java.util.Arrays;

/**
16. 3Sum Closest
Difficulty: Medium
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 Return the sum of the three integers. You may assume that each input would have exactly one solution.
    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 */
public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int closet = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int start = i + 1, end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(sum - target) < Math.abs(closet - target)){
                    closet = sum;
                }
                if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return closet;
    }
}
