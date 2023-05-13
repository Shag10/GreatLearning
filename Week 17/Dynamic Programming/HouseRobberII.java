class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        int rob = robOrNot(0, n-1, nums, dp);
        Arrays.fill(dp , -1);
        int notRob = robOrNot(1, n, nums, dp);
        return Math.max(rob, notRob);
    }

    public int robOrNot(int i, int n, int[] nums, int[] dp)
    {
        if(i == n-1) dp[i] = nums[i];
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];

        int rob = nums[i] + robOrNot(i+2, n, nums, dp);
        int notRob = robOrNot(i+1, n, nums, dp);

        return dp[i] = Math.max(rob, notRob);
    }
}
