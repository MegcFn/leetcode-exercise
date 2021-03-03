import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> res = new ArrayList<int[]>();
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            int i = 0;
            while (i < intervals.length) {
                int left = intervals[i][0], right = intervals[i][1];
                if (res.size() == 0 || left > res.get(res.size() - 1)[1])
                    res.add(intervals[i]);
                else
                    res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], right);
                i++;
            }
            return res.toArray(new int[res.size()][]);
        }
    }
}
