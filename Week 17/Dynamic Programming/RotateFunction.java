class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int sum = 0, f = 0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            f += i*nums[i];
        }

        int ans = f;

        for(int i = nums.length - 1; i > 0; i--)
        {
            f += sum - nums.length*nums[i];
            ans = Math.max(ans, f);
        }

        return ans;
    }
}
