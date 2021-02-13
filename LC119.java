import java.util.*;

class LC119{
    class Solution{
        public List<Integer> getRow(int rowIndex){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int i = 1; i <= rowIndex; i++){
                row.add(i, (int)((long)(row.get(i-1))*(rowIndex-i+1)/i));
            }
            return row;
        }
    }
}