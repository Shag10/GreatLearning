class StepstoMakeArrayNon-decreasing {
    public static int totalSteps(int[] nums) {
        int n = nums.length;
        int ans = 0;    
        Stack<Pair<Integer,Integer>> st = new Stack();    
        st.push(new Pair(nums[n-1],0));  
        for(int i=n-2;i>=0;i--)
        {
            int count = 0;
            while(!st.isEmpty() && nums[i] > st.peek().getKey())
            {
                count = Math.max(count+1 , st.peek().getValue() );
                st.pop();
            }
            ans = Math.max(ans , count);
            st.push(new Pair(nums[i],count));
        }
        return ans;
    }
    
    public static void main(String args[])
    {
        int[] nums = {5,3,4,4,7,3,6,11,8,5,11};
        System.out.println(totalSteps(nums));
    }
}
