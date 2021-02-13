import java.util.*;

public class question_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int head = 0,tail = 1;
            HashSet<Character> set = new HashSet<Character>();
            int answer = 0;
            if(s.isEmpty()) return answer;
            set.add(s.charAt(head));
            while(tail < s.length()){
                if (!set.add(s.charAt(tail))){
                    answer = set.size() > answer? set.size() : answer;
                    set.remove(s.charAt(head));
                    head++;
                }else{
                    tail++;
                }
            }
            return answer;
        }
    }
}
