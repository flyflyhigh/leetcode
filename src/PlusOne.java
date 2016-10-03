/**
 66. Plus One
 Difficulty: Easy
 Given a non-negative number represented as an array of digits, plus one to the number.
 The digits are stored such that the most significant digit is at the head of the list.

 */
public class PlusOne {
    public int[] plusOne(int[] digits){
        int carry = 1;
        int[] result = digits;
        for(int i = digits.length - 1; i >= 0; i--){
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
            if(carry == 0) break;
        }
        if(carry != 0){
            result = new int[digits.length + 1];
            result[0] = carry;
        }
        return result;
    }
}
