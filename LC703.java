import java.util.PriorityQueue;

public class LC703 {
    class KthLargest {
        private int k;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.k = k;
            if (nums.length == 0) return;
            for (int i : nums){
                this.pq.offer(i);
            }
        }
        
        public int add(int val) {
            if(pq.size() < k){
                pq.offer(val);
                return pq.peek();
            }else{
                while (pq.size() > k){
                    pq.poll();
                }
                if(val > pq.peek()){
                    pq.offer(val);
                    pq.poll();
                }
                return pq.peek();
            }
        }
    }
}
