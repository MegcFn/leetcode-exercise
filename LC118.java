import java.util.*;

public class question_118 {
    class Solution{
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> answer = new ArrayList<List<Integer>>();
            for (int i = 0; i < numRows; i++){
                List<Integer> row = new ArrayList<Integer>();
                row.add(1);
                for(int j = 1; j<=i; j++){
                    row.add(j, (int)((long)(row.get(j-1))*(i-j+1)/j));
                }
                answer.add(row);
            }
            return answer;
        }
    }
}
