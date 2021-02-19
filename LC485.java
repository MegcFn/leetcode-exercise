// public class LC485 {
//     class Solution{
//         public int findMaxConsecutiveOnes(int[] nums) {
//             int left = 0, right = 0;
//             int res = 0;
//             int N = nums.length;
//             int status = 0;
//             while(right < N){
//                 if(nums[right] == 0){
//                     left = right;
//                     while(left < N-1 && nums[left] == 0){
//                         left++;
//                     }
//                     right = left; 
//                 }
//                 if(nums[right] == 1)
//                     status = 1;
//                 if(status == 0)
//                     return 0;
//                 res = Math.max(res, right - left +1);
//                 right++;
//             }
//             return res;
//         }
//     }
// }
// A method of slide window

public class LC485{
    // class Solution{
    //     public int findMaxConsecutiveOnes(int[] nums){
    //         int index = -1;
    //         int res = 0;

    //         for(int i = 0; i < nums.length; i++){
    //             if(nums[i] == 1){
    //                 res = Math.max(res, i - index);
    //             }else{
    //                 index = i;
    //             }
    //         }
    //         return res;
    //     }
    // }
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]  == 0) {
                    max = Math.max(max, count);
                    count = 0;
                }else {
                    count ++;
                }
            }
            return Math.max(max, count);
        }
    }
}
