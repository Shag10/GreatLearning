class NodeWithHighestEdgeScore {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] edgeScore = new long[n];

        for(int i=0; i<n; i++)
        {
            edgeScore[edges[i]] += i;
        }

        int maxScoreidx = 0;

        for(int i=1; i<n; i++)
        {
            if(edgeScore[i] > edgeScore[maxScoreidx])
            {
                maxScoreidx = i;
            }
        }

        return maxScoreidx;
    }
}
