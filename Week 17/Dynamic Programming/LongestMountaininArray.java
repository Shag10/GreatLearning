class LongestMountaininArray {
    public int longestMountain(int[] arr) {
        int max = 0;
        int n = arr.length;
        int inc = 0, dec = 0, i = 1;
        while(i < n)
        {
            while(i < n && arr[i] == arr[i-1]) i++;
            inc = 0;
            while(i < n && arr[i-1] < arr[i])
            { 
                ++inc;
                ++i;
            }
            dec = 0;
            while(i < n && arr[i-1] > arr[i]) 
            {
                ++dec;
                ++i;
            }

            if(inc > 0 && dec > 0) max = Math.max(max, inc + dec + 1);
        }

        return max;
    }
}
