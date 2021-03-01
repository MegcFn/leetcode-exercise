public class LC304 {
    // class NumMatrix {
    //     private int[][] matrix;
    //     private int[][] preSum;

    //     public NumMatrix(int[][] matrix) {
    //         int M = matrix.length, N = matrix[0].length;
    //         this.matrix = matrix;
    //         preSum = new int[M][N];
    //         for (int i = 0; i < M; ++i){
    //             preSum[i][0] = matrix[i][0];
    //             for (int j = 1; j < N; ++j){
    //                 preSum[i][j] = preSum[i][j-1] + matrix[i][j];
    //             }
    //         }
    //     }
        
    //     public int sumRegion(int row1, int col1, int row2, int col2) {
    //         int res = 0;
    //         for (int i = row1; i <= row2; ++i){
    //             res += preSum[i][col2] - preSum[i][col1] + matrix[i][col1];
    //         }
    //         return res;
    //     }
    // }
    class NumMatrix {
        private int[][] sum; // sum[i+1][j+1] = sumRegion(0,0,i,j)
    
        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            int rows = matrix.length;
            int cols = matrix[0].length;
            sum = new int[rows + 1][cols + 1];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
                }
            }
        }
    
        public int sumRegion(int row1, int col1, int row2, int col2) {
            return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
        }
    }
}
