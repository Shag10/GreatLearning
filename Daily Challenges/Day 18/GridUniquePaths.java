package Daily.Challenges.io;

import java.util.Scanner;

public class GridUniquePaths {
	
	public static int gridUniquePathsRecursive(int n, int m)
	{
		//Time --> 2^n
		//Space --> 2^n
		if(n == 0 || m == 0 ) return 0;
		else if(n==1 || m == 1) return 1;
		return gridUniquePathsRecursive(n-1, m) + gridUniquePathsRecursive(n, m-1);
	}
	
	public static int gridUniquePathsOptimized(int n, int m)
	{
							// DP Approach
		//Time --> n*m
		//Space --> n*m
		int[][] count = new int[n][m];
		
		for(int i=0; i<n; i++) count[i][0] = 1;
		for(int j=0; j<m; j++) count[0][j] = 1;
		
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<m; j++)
			{
				count[i][j] = count[i-1][j] + count[i][j-1];			
			}
		}
		
		return count[n-1][m-1];
	}
	public static int gridUniquePathsBest(int n, int m)
	{
						// All combination Approach
		//Time --> O(n) or O(m)
		//Space --> O(1)
		int count =1;
		for(int i=m; i< (m+n-1) ; i++)
		{
			count *= i;
			count /= (i-m+1);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row");
		int n = sc.nextInt();
		System.out.println("Enter size of column");
		int m = sc.nextInt();
		System.out.println("Total unique paths: "+gridUniquePathsRecursive(n, m));
		System.out.println("Total unique paths: "+gridUniquePathsOptimized(n, m));
		System.out.println("Total unique paths: "+gridUniquePathsBest(n, m));
		sc.close();
	}

}
