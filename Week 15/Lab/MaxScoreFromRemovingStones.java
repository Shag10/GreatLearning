class MaxScoreFromRemovingStones {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y-x));
        if(a > 0) pq.add(a);
        if(b > 0) pq.add(b);
        if(c > 0) pq.add(c);
        int score = 0;
        while(true)
        {
            if(pq.isEmpty()) break;
            int first = pq.poll();
            if(pq.isEmpty()) break;
            int second = pq.poll();
            score++;
            if(first > 1) pq.add(--first);
            if(second > 1) pq.add(--second);
        }

        return score;
    }
}
