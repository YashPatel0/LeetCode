class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat; // Return the original matrix if reshaping is not possible
        }

        int[][] ans = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if (col == c) { 
                    // Move to the next row if the current column is full
                    col = 0;
                    row++;
                }
            }
        }

        return ans;
    }
}