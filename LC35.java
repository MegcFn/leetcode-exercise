public class LC35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int N = nums.length;
            int left = 0, right = N - 1;
            while (left <= right) {
                int mid = (left + right) >> 1;
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return left;
        }
    }
}
