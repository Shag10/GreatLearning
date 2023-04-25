class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> (a[1]-b[1]));
        int maxCapacity = capacity;
        //queue to contain passengers drop location
        PriorityQueue <int[]> dropQ = new PriorityQueue<>((x,y)->(x[1]-y[1]));
        //for each trip
        for (int[] trip: trips) {
            //add the passenger drop location to queue
            dropQ.add(new int[]{trip[0], trip[2]});
            //people boarding the cab -> reduce capacity
            capacity -= trip[0];
            assert dropQ.peek() != null;
            //did anyone get down before the current pickup location?
            if (dropQ.peek()[1] < trip[1])
            //increase the capacity if anyone got down
                capacity += dropQ.poll()[0];
            //if there are more people to get on than available capacity
            if (capacity < 0) return false;
        }
        return true;
    }
}
