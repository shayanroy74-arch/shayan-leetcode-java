class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            for (int i = 0; i < right - left; i++) {

                int top = left;
                int bottom = right;

                // Save top-left
                int temp = matrix[top][left + i];

                // Bottom-left -> Top-left
                matrix[top][left + i] = matrix[bottom - i][left];

                // Bottom-right -> Bottom-left
                matrix[bottom - i][left] = matrix[bottom][right - i];

                // Top-right -> Bottom-right
                matrix[bottom][right - i] = matrix[top + i][right];

                // Saved Top-left -> Top-right
                matrix[top + i][right] = temp;
            }

            left++;
            right--;
        }
    }
}