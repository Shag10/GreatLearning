class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int answer[] = new int[nums.length - k + 1]; 
        Deque<Integer> deque = new ArrayDeque<Integer>(); 
        for(int i=0; i<k; i++) { 
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i]) 
            { 
                deque.removeLast(); 
            } 
            deque.add(i); 
        } 
        answer[0] = nums[deque.getFirst()]; 
        int j=1; 
        for(int i=k; i<nums.length; i++) 
        {
            while(!deque.isEmpty() && deque.getFirst() < i-k+1) 
            { 
                deque.removeFirst(); 
            } 
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i]) 
            { 
                deque.removeLast(); 
            } 
            deque.add(i); 
            answer[j] = nums[deque.getFirst()]; 
            j++; 
        } 
        return answer;
    }
    
    public static void main(String[] args)
    {
        int nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int ans = new int[nums.length - k + 1];
        ans = maxSlidingWindow(nums, k);
        for(int i=0; i<anslength; i++) System.out.print(ans[i], " ");
    }
 }
