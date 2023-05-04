class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxArea = 0;
        while(l < r)
        {
            if(height[l] < height[r])
            {
                maxArea = Math.max(maxArea, height[l]*(r - l));
                l++;
            }
            else
            {
                maxArea = Math.max(maxArea, height[r]*(r - l));
                r--;
            }
        }
        return maxArea;
    }
}
