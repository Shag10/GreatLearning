import java.util.*;
public class JumpGameII {
    public static int jump(int[] nums, int n) {
        int ans = 0;
        int currFar=0, currEnd=0;
        for(int i=0; i<n-1; i++)
        {
            currFar = Math.max(currFar, i+nums[i]);
            if(i==currEnd)
            {
                ans++;
                currEnd = currFar;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //write your answer here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        System.out.println(jump(nums, n));
    }
}
