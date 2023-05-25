class MinimumCostofaPathWithSpecialRoads {
    public int minimumCost(int[] start, int[] target, int[][] specialRoads) {
        HashSet<Pair<Integer, Integer>> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);

        pq.offer(new int[] {start[0], start[1], 0});
        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            Pair currNode = new Pair(curr[0], curr[1]);

            if(visited.contains(currNode)) continue;
            if(curr[0] == target[0] && curr[1] == target[1]) return curr[2];
            visited.add(currNode);
            int cost = Math.abs(target[0] - curr[0]) + Math.abs(target[1] - curr[1]) + curr[2];
            pq.offer(new int[] {target[0], target[1], cost});

            for(int[] road : specialRoads)
            {
                Pair splRoad = new Pair(road[2], road[3]);
                if(visited.contains(splRoad)) continue;
                int costOfSpl = Math.abs(curr[0] - road[0]) + Math.abs(curr[1] - road[1]) + curr[2] + road[4];
                pq.offer(new int[] {road[2], road[3], costOfSpl});
            }
        }
        return -1;
    }
}
