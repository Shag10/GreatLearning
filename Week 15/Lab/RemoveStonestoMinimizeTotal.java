class RemoveStonestoMinimizeTotal {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y-x));
        int ans = 0;
        for(int pile : piles) pq.add(pile);
        for(int i=0; i<k; i++) 
        {
            int maxPile = pq.poll();
            int stones = maxPile/2;
            pq.add(maxPile - stones);
        }
        for(int pile : pq) ans += pile;
        return ans;
    }
}
