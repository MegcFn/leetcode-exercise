public class LC303 {
    class NumArray {
        private int[] array;
        private int[] preSum;

        public NumArray(int[] nums) {
            this.array = nums;
            if (array.length == 0)
                return;
            this.preSum = new int[array.length];
            preSum[0] = array[0];
            for (int i = 1; i < array.length; ++i) {
                preSum[i] = preSum[i - 1] + array[i];
            }
        }

        public int sumRange(int i, int j) {
            int res = 0;
            if (array.length == 0)
                return res;
            res = preSum[j] - preSum[i] + array[i];
            return res;
        }
    }
}
