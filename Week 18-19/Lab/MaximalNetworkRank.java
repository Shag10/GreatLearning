class MaximalNetworkRank {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] networkRank = new int[n];
        int[][] adjNetwork = new int[n][n];

        for(int[] road : roads)
        {
            networkRank[road[0]]++;
            networkRank[road[1]]++;
            adjNetwork[road[0]][road[1]] = 1;
            adjNetwork[road[1]][road[0]] = 1;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int maxRankOfPair = networkRank[i] + networkRank[j] - adjNetwork[i][j];
                max = Math.max(max, maxRankOfPair);
            }
        }

        return max;
    }
}
