/**
 3. Longest Substring Without Repeating Characters
 Difficulty: Medium
 Given a string, find the length of the longest substring without repeating characters.
 Examples:
 Given "abcabcbb", the answer is "abc", which the length is 3.
 Given "bbbbb", the answer is "b", with the length of 1.
 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a 
 subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s){
        int longest = 0;
        int[] map = new int[128];
        int start = 0, end = 0, repeat = 0;
        while(end < s.length()){
            if(map[s.charAt(end++)]++ > 0){
                repeat++;
            }
            while (repeat > 0){
                if(--map[s.charAt(start++)] == 1){
                    repeat--;
                }
            }
            longest = Math.max(longest, end - start);
        }
        return longest;
    }
}
