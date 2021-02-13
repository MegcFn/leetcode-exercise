public class question9 {
    class Solution {
        public boolean isPalindrome(int x) {
            long num = 0;
            int temp = x;
            while (temp != 0) {
                num = num * 10 + temp % 10;
                temp /= 10;
            }
            return (int) num == x ? true : false;
        }
    }
}
