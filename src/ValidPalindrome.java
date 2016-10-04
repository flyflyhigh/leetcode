/**
 125. Valid Palindrome

 QuestionEditorial Solution
 •	Difficulty: Easy
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.
 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.
 For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        int start = 0, end = s.length() - 1;
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(end > start && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
