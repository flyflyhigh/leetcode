/**
 48. Rotate Image
 Difficulty: Medium
 You are given an n x n 2D matrix representing an image.
 Rotate the image by 90 degrees (clockwise).
 Follow up: Could you do this in-place?

 */
public class RotateImage {
    public void rotate(int[][] matrix){
        int n = matrix.length - 1;
        int left = 0, right = n;
        for(int i = 0; i < matrix.length / 2; i++){
            for(int j = left; j < right; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = tmp;
            }
            left++;
            right--;
        }
    }
}
