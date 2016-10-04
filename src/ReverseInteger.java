/**
 7. Reverse Integer
 •	Difficulty: Easy
 Reverse digits of an integer.
 Example1: x = 123, return 321
 Example2: x = -123, return -321

 */
public class ReverseInteger {
    public int reverse(int x){
        long result = 0;
        while(x != 0){
            result = result * 10 + x % 10;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                result = 0;
                break;
            }
            x /= 10;
        }
        return (int)result;
    }
}
