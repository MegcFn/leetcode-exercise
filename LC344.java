public class LC344 {
    class Solution {
        public void reverseString(char[] s) {
            int i = 0, j = s.length-1;
            reverseFunction(s,i,j);
        }
        public void reverseFunction(char[] arr,int i, int j){
            if(i>=j) return;

            swap(arr,i,j);
            reverseFunction(arr, ++i, --j);
        }
        public void swap(char[] arr, int i, int j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
