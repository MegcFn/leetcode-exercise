//just like B082 of Paiza
public class LC1004{
    class Solution{
        public int longestOnes(int[] A, int K){
            int left = 0, right = 0;
            int res = 0;
            int count = 0;
            int N = A.length;

            while (right < N){
                if (A[right] == 0)
                    count++;
                while (count > K){
                    if(A[left++] == 0)
                        count--;
                }
                right++;
                res = Math.max(res, right - left + 1);
            }
            return res;
        }
    }
}
