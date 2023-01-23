package Daily.Challenges.io;

import java.util.*;

public class SubarrayWithgivenXorK {
	
	public static int subarrayWithgivenXorKBruteforce(int[] A,int n, int B)
	{
		//Time --> O(n^2)
		//Space --> O(1)
		int count = 0;
		for(int i=0; i<n; i++)
		{
			int curr_xor = 0;
			for(int j=i; j<n; j++)
			{
				curr_xor ^= A[j];
				if(curr_xor == B) count++;
			}
		}
		
		return count;
	}
	public static int subarrayWithgivenXorKOptimize(int[] A,int n, int B)
	{
		HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
	    int c = 0;
	    int cpx = 0;
	    for(int i = 0;i<n;i++) {
	      cpx = cpx ^ A[i];
	      if(visited.get(cpx^B) != null)
	        c += visited.get(cpx ^ B);
	      if(cpx == B) {
	        c++;
	      }
	      if(visited.get(cpx) != null)
	        visited.put(cpx, visited.get(cpx) + 1);
	      else
	        visited.put(cpx, 1);
	    }
	    return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] A = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			A[i] = sc.nextInt();
		}
		System.out.println("Enter the target XOR");
		int B = sc.nextInt();
		System.out.println("Answer brute force: "+subarrayWithgivenXorKBruteforce(A, n, B));
		System.out.println("Answer Optimized: "+subarrayWithgivenXorKOptimize(A, n, B));
		sc.close();
	}

}
