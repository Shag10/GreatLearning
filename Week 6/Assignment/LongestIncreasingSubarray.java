import java.util.*;
public class LongestIncreasingSubarray {

    public static int longestContiguousSubarray(int[] arr, int n)
    {
        if(n == 0) return 0;
        int count = 1;
        int maxCount = 0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] < arr[i+1]) count++;
            else 
            {
                if(count > maxCount) maxCount = count;
                count = 1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        //write your answer here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(longestContiguousSubarray(arr, n));
    }
}
