public class LC27 {
    class Solution{
        public int removeElement(int[] nums, int val){
            int N = nums.length;
            int i = 0;
            for(int j = 0; j < N; j++){
                if(nums[j] != val){
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
