/**
 4. Median of Two Sorted Arrays
 Difficulty: Hard
 There are two sorted arrays nums1 and nums2 of size m and n respectively.
 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 Example 1:
 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:
 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5

 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int start = 0, end = nums1.length, half = (nums1.length + nums2.length + 1) / 2;
        while(start <= end){
            int i = start + (end - start) / 2;
            int j = half - i;
            if(j > 0 && i < nums1.length && nums2[j - 1] > nums1[i]){
                start = i + 1;
            }else if(i > 0 && j < nums2.length && nums1[i - 1] > nums2[j]){
                end = i - 1;
            }else{
                int maxleft, minright;
                if(i == 0){
                    maxleft = nums2[j - 1];
                }else if(j == 0){
                    maxleft = nums1[i - 1];
                }else{
                    maxleft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if((nums1.length + nums2.length) % 2 != 0){
                    return maxleft;
                }

                if(i == nums1.length){
                    minright = nums2[j];
                }else if(j == nums2.length){
                    minright = nums1[i];
                }else{
                    minright = Math.min(nums1[i], nums2[j]);
                }

                return (maxleft + minright) / 2.0;
            }
        }
        return 0.0;
    }
}
