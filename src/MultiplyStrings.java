/**
 43. Multiply Strings
 Difficulty: Medium
 Given two numbers represented as strings, return multiplication of the numbers as a string.
 Note:
 The numbers can be arbitrarily large and are non-negative.
 Converting the input string to integer is NOT allowed.
 You should NOT use internal library such as BigInteger.

 */
public class MultiplyStrings {
    public String multiply(String num1, String num2){
        int[] result = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length() - 1; j >= 0; j--){
                int pos1 = i + j, pos2 = i + j + 1;
                int multiply = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                result[pos2] += multiply;
                result[pos1] += result[pos2] / 10;
                result[pos2] %= 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.length; i++){
            if(result[i] != 0 || sb.length() != 0){
                sb.append(result[i]);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
