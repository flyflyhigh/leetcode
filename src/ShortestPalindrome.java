/**
 214. Shortest Palindrome
 •	Difficulty: Hard
 Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return
 the shortest palindrome you can find by performing this transformation.
 For example:
 Given "aacecaaa", return "aaacecaaa".
 Given "abcd", return "dcbabcd".
 Credits:
 Special thanks to @ifanchu for adding this problem and creating all test cases. Thanks to @Freezen for additional test cases.

 */
public class ShortestPalindrome {
    public String shortestPalindrome(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        String all = s + "#" + reverse;
        int[] next = new int[all.length()];
        for(int i = 1; i < all.length(); i++){
            int j = next[i - 1];
            while(j > 0 && all.charAt(i) != all.charAt(j)){
                j = next[j - 1];
            }
            next[i] = j + (all.charAt(i) == all.charAt(j) ? 1 : 0);
        }
        return reverse.substring(0, reverse.length() - next[all.length() - 1]) + s;
    }
}
