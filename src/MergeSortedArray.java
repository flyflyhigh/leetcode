import java.util.Arrays;

/**
 88. Merge Sorted Array
 •	Difficulty: Easy
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
 from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int idx = m + n - 1;
        int idx1 = m - 1, idx2 = n - 1;
        while(idx1 >= 0 && idx2 >= 0){
            if(nums1[idx1] >= nums2[idx2]){
                nums1[idx] = nums1[idx1];
                idx1--;
            }else{
                nums1[idx] = nums2[idx2];
                idx2--;
            }
            idx--;
        }
        while(idx2 >= 0){
            nums1[idx--] = nums2[idx2--];
        }
    }
}
