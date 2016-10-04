/**
 8. String to Integer (atoi)

 •	Difficulty: Easy
 Implement atoi to convert a string to an integer.
 Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself
 what are the possible input cases.
 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to
 gather all the input requirements up front.
 Update (2015-02-10):
 The signature of the C++ function had been updated. If you still see your function signature accepts a const char *
 argument, please click the reload button  to reset your code definition.
 spoilers alert... click to show requirements for atoi.

 */
public class StringToInteger {
    public int myAtoi(String str){
        boolean sign = false, foundSign = false;
        long result = 0;
        str = str.trim();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '+' || ch == '-'){
                if(foundSign) {
                    break;
                }
                foundSign = true;
                sign = ch == '-';
                continue;
            }
            if(!Character.isDigit(ch)){
                break;
            }
            result = result * 10 + Character.getNumericValue(ch);
            if(!sign && result > Integer.MAX_VALUE){
                result = Integer.MAX_VALUE;
                break;
            }else if(sign && -result < Integer.MIN_VALUE){
                result = Integer.MIN_VALUE;
                sign = false;
                break;
            }
        }
        return (int)(sign ? -result : result);
    }
}
