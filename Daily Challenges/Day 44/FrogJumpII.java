package Daily.Challenges.io;

import java.util.*;

public class FrogJumpII {
	
	public static int maxJump(int[] stones) {
        int low = stones[0]; 
        int high = stones[ stones.length-1 ]; 
        int ans = 0; 
        while( low <= high ) 
        { 
            int mid = (low + high)>>1; 
            if(isPossible(mid, stones)) 
            { 
                ans = mid; 
                high = mid -1; 
            } 
            else 
            { 
                low = mid+1; 
            } 
        } 
        return ans; 
    } 
    
    public static boolean isPossible(int k, int stones[]) 
    { 
        Set<Integer>set = new HashSet<>(); 
        int last = 0; 
        for(int i = 1; i<stones.length; i++) 
        { 
            if(stones[i] - stones[last] > k) 
            { 
                if(i - last > 1) 
                { 
                    set.add( i-1 ); 
                    last = i-1; 
                    i--; 
                } 
                else 
                { 
                    return false; 
                } 
            } 
        } 
        last = stones.length - 1;
        for(int i = stones.length-2; i >= 0; i--) 
        { 
            if(set.contains(i) == false)
            {
                if(stones[last] - stones[i] > k) 
                { 
                    return false;
                }
                else 
                { 
                    last = i;
                } 
            }
        } 
        return true;
    }
    
    public static int maxJumpBetter(int[] stones) {
        int max = stones[1] - stones[0],n = stones.length;
        for(int i = 2; i<n; ++i)
            max = Math.max(max, stones[i] - stones[i-2]);
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] stones = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			stones[i] = sc.nextInt();
		}
		System.out.println("Minimum cost of the path for frog: "+maxJump(stones));
		System.out.println("Minimum cost of the path for frog: "+maxJumpBetter(stones));
		sc.close();
	}

}
