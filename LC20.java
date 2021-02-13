import java.util.Deque;
import java.util.LinkedList;
public class question_20 {
    class Solution {
        public boolean isValid(String s) {
            if (s.length()%2 == 1 || s.isEmpty()){
                return false;
            }
            Deque<Character> stack = new LinkedList<Character>();
            for (int i = 0; i < s.length(); i++){
                if(stack.isEmpty()){
                    stack.push(s.charAt(i));
                }else if (s.charAt(i) - stack.peek() == 1 || s.charAt(i) - stack.peek() == 2){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
            return stack.isEmpty();
        }
    }
}
