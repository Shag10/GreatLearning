class ReduceArraySizetoHalf {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int size = arr.length;
        int rem = arr.length;
        for(int i=0; i<size; i++) hm.put(arr[i], hm.getOrDefault(arr[i], 0)+ 1);
        //System.out.println(hm);
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y-x));
        for(int val : hm.values()) pq.add(val);
        //System.out.println(pq);
        int ans = 0;
        while(rem > size/2)
        {
            int count = pq.poll();
            rem = rem-count;
            ans++;
        }
        return ans;
    }
}
