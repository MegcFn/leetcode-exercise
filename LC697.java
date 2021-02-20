import java.util.*;

public class LC697 {
    class Solution {
        public int findShortestSubArray(int[] nums) {
            int N = nums.length;
            Map<Integer, int[]> hp = new HashMap<Integer, int[]>();
            for (int i = 0; i < N; i++){
                if(hp.containsKey(nums[i])){
                    hp.get(nums[i])[0]++;
                    hp.get(nums[i])[2] = i;
                }else{
                    hp.put(nums[i], new int[]{1,i,i});
                }
            }
            int degree = 0, answer = 0;
            for(Map.Entry<Integer,int[]> entry : hp.entrySet()){
                if(entry.getValue()[0] > degree){
                    degree = entry.getValue()[0];
                    answer = entry.getValue()[2] - entry.getValue()[1] + 1;
                }else if (entry.getValue()[0] == degree){
                    answer = Math.min(answer, entry.getValue()[2] - entry.getValue()[1] + 1);
                }
            }
            return answer;
        }
    }
}
