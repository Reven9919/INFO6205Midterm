import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Question4 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals);

        List<int[]> result = new ArrayList<>();
        int[] newInt = intervals[0];
        result.add(newInt);
        for (int[] interval : intervals) {
            if (interval[0] <= newInt[1])
                newInt[1] = Math.max(newInt[1], interval[1]);
            else {
                newInt = interval;
                result.add(newInt);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}