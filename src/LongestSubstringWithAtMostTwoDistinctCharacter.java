/**
 159. Longest Substring with At Most Two Distinct Characters
 Difficulty: Hard
 Given a string, find the length of the longest substring T that contains at most 2 distinct characters.
 For example, Given s = “eceba”,
 T is "ece" which its length is 3.
 */
public class LongestSubstringWithAtMostTwoDistinctCharacter {
    public int lengthOfLongestSubstringTwoDistinct(String s){
        int[] map = new int[128];
        int start = 0, end = 0, distinct = 0, longest = 0;
        while(end < s.length()){
            if(map[s.charAt(end++)]++ == 0){
                distinct++;
            }
            while(distinct > 2){
                if(--map[s.charAt(start++)] == 0){
                    distinct--;
                }
            }
            longest = Math.max(longest, end - start);
        }
        return longest;
    }
}
