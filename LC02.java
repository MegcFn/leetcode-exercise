public class LC02 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return add(l1,l2,0);
        }
        public ListNode add(ListNode l1, ListNode l2, int carry){
            if (l1 == null && l2 == null && carry == 0) return null;
            int sum = (l1 == null ? 0: l1.val) + (l2 == null ? 0: l2.val) + carry;
            ListNode answer = new ListNode(sum%10);
            answer.next = add(l1.next, l2.next, sum/10);
            return answer;
        }
    }
}
