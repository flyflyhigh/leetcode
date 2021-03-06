/**
 6. ZigZag Conversion

 QuestionEditorial Solution
 My Submissions
 •	Total Accepted: 102230
 •	Total Submissions: 409236
 •	Difficulty: Easy
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:
 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    public String convert(String s, int numRows){
        if(numRows == 1){
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            sbs[i] = new StringBuilder();
        }
        int idx = 0, incr = 0;
        for(int i = 0; i < s.length(); i++){
            sbs[idx].append(s.charAt(i));
            if(idx == 0){
                incr = 1;
            }else if(idx == numRows - 1){
                incr = -1;
            }
            idx += incr;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            sb.append(sbs[i]);
        }
        return sb.toString();
    }
}
