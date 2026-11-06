class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int[] arr = new int[queries.length];

        int left = 0;
        int right = 0;

        // sorting the logs array based on the time stamps of server 
        Arrays.sort(logs, (row1, row2) -> Integer.compare(row1[1], row2[1]));

        int[][] queriesSorted = new int[queries.length][2];
        for(int i = 0; i < queries.length; i++){
            queriesSorted[i][0] = queries[i];
            queriesSorted[i][1] = i;
        }

        // sorting the queries 
        Arrays.sort(queriesSorted, (row1, row2) -> Integer.compare(row1[0], row2[0]));
        
        int freq[] = new int[n+1];
        int activeServers = 0;

        for(int i = 0; i < queriesSorted.length; i++){
            int query = queriesSorted[i][0];
            int start = query-x;
            int end = query;


            // finding the total active servers until end time
            while(right < logs.length && logs[right][1] <= end){
                int server = logs[right][0];
                if(freq[server] == 0) activeServers++;
                freq[server]++;
                right++;
            }

            // removing the servers included in the activeServers before the start time
            while(left < right && logs[left][1] < start){
                int server = logs[left][0];
                freq[server]--;
                if(freq[server] == 0) activeServers--;
                left++;
            }

            // total number of inactive servers
            int inactive = n - activeServers;
            int originalIndex = queriesSorted[i][1];

            arr[originalIndex] = inactive;
        }

        return arr;
    }
}