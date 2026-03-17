import java.util.*;

class Solution {
    public int largestSubmatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] res = new int[n][m];

        // Step 1: Build height matrix column-wise
        for (int i = 0; i < m; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] == 1) {
                    c++;
                    res[j][i] = c;
                } else {
                    c = 0;
                    res[j][i] = 0;
                }
            }
        }

        // Step 2: Sort each row in descending order
        for (int r = 0; r < n; r++) {

            Arrays.sort(res[r]);  // ascending

            // manual reverse
            for (int l = 0, h = m - 1; l < h; l++, h--) {
                int temp = res[r][l];
                res[r][l] = res[r][h];
                res[r][h] = temp;
            }
        }

        // Step 3: Calculate maximum area
        int area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                area = Math.max(area, res[i][j] * (j + 1));
            }
        }

        return area;
    }
}