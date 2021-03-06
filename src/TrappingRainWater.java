/**
 42. Trapping Rain Water
 •	Difficulty: Hard
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water
 it is able to trap after raining.
 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.

 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water
 (blue section) are being trapped. Thanks Marcos for contributing this image!

 */
public class TrappingRainWater {
    public int trap(int[] height){
        int result = 0;
        int start = 0, end = height.length - 1;
        int maxleft = 0, maxright = 0;
        while(start < end){
            if(height[start] <= height[end]){
                if(maxleft < height[start]){
                    maxleft = height[start];
                }else{
                    result += maxleft - height[start];
                }
                start++;
            }else{
                if(maxright < height[end]){
                    maxright = height[end];
                }else{
                    result += maxright - height[end];
                }
                end--;
            }
        }
        return result;
    }
}
