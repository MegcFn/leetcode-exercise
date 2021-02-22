public class LC766 {
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length;
            if(m == 1)
                return true;
            for(int i = 0; i < m - 1; i++){
                int n = matrix[i].length;
                if(n == 1)
                    return true;
                for(int j = 0; j < n - 1; j++){
                    if (matrix[i][j] != matrix[i+1][j+1])
                        return false;
                }
            }
            return true;
        }
    }
}
