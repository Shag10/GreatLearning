package Daily.Challenges.io;

import java.util.*;

public class CombinationSum {
	
	public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) 
	{
		if (ind == arr.length) 
		{
			if (target == 0) 
			{
				ans.add(new ArrayList < > (ds));
			}
			return;
		}

		if (arr[ind] <= target) 
		{	
			ds.add(arr[ind]);
			findCombinations(ind, arr, target - arr[ind], ans, ds);
			ds.remove(ds.size() - 1);
		}
		findCombinations(ind + 1, arr, target, ans, ds);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) 
	{
		List < List < Integer >> ans = new ArrayList < > ();
		findCombinations(0, candidates, target, ans, new ArrayList < > ());
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target sum");
		int sum = sc.nextInt();
		List<List<Integer>> ls = combinationSum(arr, sum);

		System.out.println("Combinations are: ");
		for (int i = 0; i < ls.size(); i++) 
		{
			for (int j = 0; j < ls.get(i).size(); j++) 
			{	
				System.out.print(ls.get(i).get(j) + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
