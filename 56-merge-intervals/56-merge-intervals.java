class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        int i = 0;
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int first = intervals[i][0];
        int second = intervals[i][1];

        while (i < len) {
            if (intervals[i][0] <= second) {
                second = Math.max(second, intervals[i][1]);
            } else {
                result.add(new int[]{first, second});
                first = intervals[i][0];
                second = intervals[i][1];
            }
            i++;
        }
        result.add(new int[]{first, second});
        return result.toArray(new int[0][]);
    }
}