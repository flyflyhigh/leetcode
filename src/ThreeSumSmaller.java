import java.util.Arrays;

/**
259. 3Sum Smaller
Difficulty: Medium
Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that
 satisfy the condition nums[i] + nums[j] + nums[k] < target.
For example, given nums = [-2, 0, 1, 3], and target = 2.
Return 2. Because there are two triplets which sums are less than 2:
[-2, 0, 1]
[-2, 0, 3]
Follow up: Could you solve it in O(n2) runtime?

 */
public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target){
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] >= target) break;
            int start = i + 1, end = nums.length - 1;
            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum < target){
                    count += end - start;
                    start++;
                }else{
                    end--;
                }
            }
        }
        return count;
    }
}
