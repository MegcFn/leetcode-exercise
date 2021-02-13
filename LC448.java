import java.util.*;

public class LC448{
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums){
            List<Integer> answer = new ArrayList<Integer>();
            int n = nums.length;
            for(int i = 0; i < n; i++){
                if(nums[Math.abs(nums[i])-1] < 0)
                    continue;
                nums[Math.abs(nums[i])-1] *= -1;
            }
            for (int i = 0; i < n; i++){
                if(nums[i]>0)
                    answer.add(i+1);
            }
            return answer;
        }    
    }
}