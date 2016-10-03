/**
 67. Add Binary
 Difficulty: Easy
 Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".
 */
public class AddBinary {
    public String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int idxa = a.length() - 1, idxb = b.length() - 1, carry = 0;
        while (idxa >= 0 || idxb >= 0 || carry != 0){
            int va = idxa >= 0 ? Character.getNumericValue(a.charAt(idxa)) : 0;
            int vb = idxb >= 0 ? Character.getNumericValue(b.charAt(idxb)) : 0;
            int sum = va + vb + carry;
            carry = sum / 2;
            sum %= 2;
            sb.append(sum);
            idxa--;
            idxb--;
        }
        return sb.reverse().toString();
    }
}
