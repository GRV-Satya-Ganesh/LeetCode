
class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int m = tasks.length;
        PriorityQueue<int[]> free = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        for (int i = 0; i < servers.length; i++) free.offer(new int[]{servers[i], i});

        int[] ans = new int[m];
        long time = 0;

        for (int j = 0; j < m; j++) {
            time = Math.max(time, j);
            if (free.isEmpty()) time = Math.max(time, busy.peek()[0]);

            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                long[] b = busy.poll();
                free.offer(new int[]{(int) b[1], (int) b[2]});
            }

            int[] s = free.poll();
            ans[j] = s[1];
            busy.offer(new long[]{time + tasks[j], s[0], s[1]});
        }
        return ans;
    }
}
