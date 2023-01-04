package Daily.Challenges.io;

import java.util.*;

public class IntersectionAndUnion {
	
	public static void UnionNormalVersion(int[] arr1, int n, int[] arr2, int m)
	{
		//Using HashSet 
		//Time complexity --> O(m*log(m)+n*log(n))
		//Auxiliary Space --> O(m+n)
		
		HashSet<Integer> union = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			union.add(arr1[i]);		
		}
		for(int j=0; j<m; j++)
		{
			union.add(arr2[j]);
		}
		
		System.out.println("Union of two arrays are: ");
		System.out.print(union.toString()+" ");
		System.out.println();
	}
	
	public static void Intersection(int[] arr1, int n, int[] arr2, int m)
	{
		HashSet<Integer> intersection = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			intersection.add(arr1[i]);
		}
		System.out.println("Intersection5 of two arrays are: ");
		for(int i=0; i<m; i++)
		{
			if(intersection.contains(arr2[i]))
			{
				System.out.print(arr2[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void UnionBetterVersion(int[] arr1, int n, int[] arr2, int m)
	{
		//Using HashSet 
		//Time complexity --> O(max(m,n))
		//Auxiliary Space --> O(max(m,n))
		
		int min = (n < m) ? n:m;
		Set<Integer> union = new HashSet<>();
		for(int i=0; i< min; i++)
		{
			union.add(arr1[i]);
			union.add(arr2[i]);
		}
		if(n > m)
		{
			for(int i=m; i<n; i++)
			{
				union.add(arr1[i]);
			}
		}
		else if(m > n)
		{
			for(int i=n; i<m; i++)
			{
				union.add(arr2[i]);
			}
		}
		System.out.println("(Better Version) Union of two arrays are: ");
		System.out.print(union.toString()+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array1: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter elements in Array1: ");
		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size of Array2: ");
		int m = sc.nextInt();
		int[] arr2 = new int[n];
		System.out.println("Enter elements in Array2: ");
		for(int i=0; i<m; i++)
		{
			arr2[i] = sc.nextInt();
		}
		UnionNormalVersion(arr1, n, arr2, m);
		UnionBetterVersion(arr1, n, arr2, m);
		Intersection(arr1, n, arr2, m);
		sc.close();
	}

}
