public class LC724 {
    class Solution {
        public int pivotIndex(int[] nums) {
            if (nums.length == 0)
                return -1;
            if (nums.length == 1)
                return 0;
            int preSum = 0, total = 0;
            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                if (preSum + preSum + nums[i] == total)
                    return i;
                preSum += nums[i];
            }
            return -1;
        }
    }
}
