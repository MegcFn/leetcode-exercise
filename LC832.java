public class LC832 {
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int M = A.length;
            for (int i = 0; i < M; i++) {
                swapAndTransform(A[i]);
            }
            return A;
        }

        public void swapAndTransform(int[] array) {
            int N = array.length;
            for (int i = 0; i < N; i++) {
                array[i] = array[i] == 1 ? 0 : 1;
            }
            int left = 0, right = N - 1;
            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
