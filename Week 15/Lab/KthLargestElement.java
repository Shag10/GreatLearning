class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> (y - x));
        for(int num : nums) pq.add(num);
        System.out.println(pq);
        for(int i=1; i<k; i++) pq.poll();
        return pq.poll();
    }
}
